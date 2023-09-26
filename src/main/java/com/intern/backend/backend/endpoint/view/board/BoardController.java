package com.intern.backend.backend.endpoint.view.board;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.intern.backend.backend.endpoint.api.board.service.BoardDataService;
import com.intern.backend.backend.endpoint.api.board.support.BoardVo;
import com.intern.backend.backend.endpoint.api.board.support.Pagination;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

	private final BoardDataService boardDataService;

	@GetMapping("/ssr") //메서드에 매개변수를 Model타입의 model변수 선언
	public String ssr(Model model, @RequestParam(defaultValue = "1") int page, //페이지 데이터
									@RequestParam(defaultValue = "10") int pageSize) { //페이지당 데이터 크기 제한

		//총 게시물 수를 구하는 로직을 생성
		int totalListCnt = boardDataService.findAllCount();

		// Pagination 클래스 -> 해당 클래스의 생성자에 총 게시물 수와 현재 페이지, 게시글 최대 개수를 전달하는 로직 생성
		Pagination pagination = new Pagination(totalListCnt, page, pageSize);

		int startIndex = pagination.getStartIndex(); //0으로 들어옴

		// 리스트 가져오기(List) //얼만큼의 게시물 가져올지 설정
		// 1부터 10번째까지 뽑아낸다 //0값, 10값 //리스트는 0부터 시작 -> 게시물 1번
		List<BoardVo> list = boardDataService.getRangeBoardData(startIndex, pageSize);

		//model로 html쪽에 데이터 전달
		model.addAttribute("data", list); //model에 addAttribute담고, html쪽에 전달
		model.addAttribute("pagination", pagination);
		model.addAttribute("pageSize", pageSize);

		//model이 담은 데이터를 html파일에 전송

		return "ssr_paging";//동작을 다 한 ssr_paging을 브라우저에게 던진다
	}

	@GetMapping("/csr")
	public String csr() {
		return "csr_paging"; //브라우저에게 csr_paging.html을 줌
	}

}

// Spring Model -> Model 객체는 컨트롤러에서 데이터를 생성해 이를 View에 전달하는 역할(view로 전달할 때 사용하는 객체)

//// @RequestParam(value="파라미터 이름", defaultValue = "기본값") 데이터타입 변수명
//	-> 이 컨트롤러에게 전달되는 파라미터를 수신한다. -> 파라미터를 받아서 변수에 넣어주는~
//	-> 값이 없을 경우에 대한 기본값 설정이 가능하며, 기본값의 명시는 생략 가능
//	-> 파라미터 처리와 함께 데이터타입과 변수명이 함께 명시됨(파라미터를 사용하지 않을 경우 생략 가능)
//	-> @RequestParam(required=true, false) : true가 기본값, false인 경우 값을 입력하지 않으면 null이 들어감
//	-> @RequestParam(defaultValue = " ") : 요청파라미터로 null이 아닌 아무 값도 넘어오지 않았을 때와 빈문자인 경우에 들어갈 기본값
//	-> defaultValue가 설정되어 있는 경우 required=false 설정은 의미가 없음(기본값이 항상 들어가기때문에) -> 1로 설정되어 있어 기본값이 들어간다
