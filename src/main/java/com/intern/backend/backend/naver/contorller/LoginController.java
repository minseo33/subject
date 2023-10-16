package com.intern.backend.backend.naver.contorller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.intern.backend.backend.naver.dto.Member;
import com.intern.backend.backend.naver.service.MainService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/naver/login")
public class LoginController {

	private final MainService mainService;

	@GetMapping
	public String login() {
		return "naver/login"; // login.html을 반환합니다.
	}
	
//	@GetMapping
//	public String login(Model model) {
//		model.addAttribute("errorMessage", ""); //오류 메시지를 초기화합니다.
//		return "naver/login"; // login.html을 반환합니다.
//	}

	@PostMapping("/doLogin")
	@ResponseBody
	public Map<String, Object> doLogin(@RequestBody Map<String, String> loginData) {
		Map<String, Object> response = new HashMap<>();

		Member member = new Member();

		// 존재하는 아이디인가
		Map<String, String> paramMap1 = new HashMap<>();
		paramMap1.put("user_id", loginData.get("user_id").toString());

		member = mainService.selectUserInfo(paramMap1);

		if (member == null) {
			// 존재하는 아이디가 없음.
			response.put("message", "인증정보가 올바르지 않습니다.");
		} else if (member != null) {
			// 일단 아이디는 존재하는 상태임.

			int failCount = member.getPwd_errornum(); // 인증 실패 횟수

			if (failCount < 4) {
				// 파라미터에 이제 받은 아이디와 비밀번호를 넘겨서 맞는 정보가 있는지 확인
				paramMap1.put("user_pwd", loginData.get("user_pwd").toString());

				Member result = new Member();
				result = mainService.selectUserInfo(paramMap1);

				if (result == null) {
					// 비밀번호 틀림.
					response.put("message", "인증정보가 올바르지 않습니다.");
				} else if (result != null) {
					// 전달받은 아이디와 비밀번호로 유저를 찾음.
					response.put("message", "SUCCESS");
				}
			} else {
				response.put("message", "계정을 사용할 수 없습니다. 관리자에게 문의하세요.");
				member.setAccountLocked(true);
				mainService.updateMember(member);
			}
		}

		return response;
	}

}