package com.intern.backend.backend.endpoint.view;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.intern.backend.backend.endpoint.api.board.service.BoardDataService;
import com.intern.backend.backend.endpoint.api.board.support.BoardVo;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class IndexController{
	
	private final BoardDataService boardDataService;
	
	//타임리프
	@GetMapping("/tyhmeleaf")
    public String dataThy(Model model) { 
		//"/board/tyhmeleaf" 경로로 GET 요청이 발생했을 때 호출 
		// Model 객체를 사용하여 Thymeleaf 템플릿에 데이터를 전달
        List<BoardVo> boardData = boardDataService.getBoardData();
        model.addAttribute("data", boardData); // "datum"라는 이름으로 모델에 데이터 추가
        return "index"; // index.html 템플릿 파일로 이동
    }
	
	//웹 브라우저
	@GetMapping("/web")
    public String dataWeb(Model modell) {
		List<BoardVo> boardData = boardDataService.getBoardData();
		modell.addAttribute("data", boardData);
        return "index2"; // index2.html 템플릿 파일로 이동
    }
    

}

/*
* 클라이언트 사이드(Client-Side)
* - 클라이언트(사용자) 측에서 처리하는 것
*  - 클라이언트가 입력한것을 수신해서 HTML로 만들어서 크롬과 같은 어플리케이션에 해석해서 표시
- 장점
서버 관리자의 입장에서 데이터 위조의 가능성을 줄일 수 있다.
서버쪽의 데이터가 확실히 진짜이며 클라이언트 쪽에서 위조해서는 안되는 민감한 데이터의 경우 Server side로 처리해야 한다.
예를들어 인터넷 뱅킹의 이체 관련 처리나 MMORPG의 게임 아이템 관련 처리에서는 Client side로 처리를 최소화해야 한다.
이때 Client 사용자의 입장에서는 클라이언트 컴퓨터의 처리부담이 줄어든다.

- 단점
서버 관리자의 입장에서 서버의 처리 부담이 커져 서버 비용이 늘어날 수 있다.
*/

/*
* 서버 사이드(Server-Side)
* - 서버 사이드는 클라이언트로 보낼 웹 페이지(HTML, JavaScript 등이 담긴)를 만들며,
*  - 정말 중요한 작업들(사용자 유효성, DB 관련 등)을 수행
서버 관리자 입장에서 서버의 처리부담을 줄여 서버 비용을 줄일 수 있다.
처리하는 데이터가 보안에 민감한 경우, 클라이언트 내에서 처리 가능한 부분에 대해서는 통신에 대비하여 암호화할 필요가 없어져 암호화 소요가 줄어든다.

- 단점
서버 관리자의 입장에서 Client side에서 처리한 결과를 되받아야 하는 경우에 결과의 진위성을 알기 어렵다.
이것은 클라이언트 쪽에서 데이터를 위조하기 쉽다는 말과 같다.
서버쪽의 데이터가 확실한 진위이며 클라이언트 쪽에서 위조해서는 안되는 민감한 데이터의 경우 Server side로 처리해야 한다.
클라이언트 사용자에게는 클라이언트 컴퓨터의 처리 부담이 많아진다.
*/

