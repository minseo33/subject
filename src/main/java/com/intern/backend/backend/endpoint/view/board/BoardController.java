package com.intern.backend.backend.endpoint.view.board;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.intern.backend.backend.endpoint.api.board.service.BoardDataService;
import com.intern.backend.backend.endpoint.api.board.support.BoardVo;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

	private final BoardDataService boardDataService;
	
	//dataThy 메서드는 페이지와 페이지 크기를 매개변수로 받아와 해당 페이지의 데이터를 가져와 모델에 추가한 다음 
	//Thymeleaf 템플릿을 통해 클라이언트에 표시(?)
	@GetMapping("/ssr")
    public String dataThy(Model model,
                          @RequestParam(defaultValue = "0") int page,     
                          @RequestParam(defaultValue = "10") int size) {   //페이지당 데이터 크기 제한
        List<BoardVo> boardData = boardDataService.getBoardData(page, size); // 현재 페이지의 데이터 가져오기(List)
        model.addAttribute("data", boardData); //model에 현재 페이지의 데이터 추가
        model.addAttribute("page", page); // 현재 페이지 번호를 모델에 추가
//        model.addAttribute("pageNumbers", pageNumbers); // 페이지 번호 리스트
//        model.addAttribute("totalPages", totalPages); // 전체 페이지 수
        return "ssr_paging"; // ssr_paging.html 템플릿 파일로 이동
    }	
}

//	// 타임리프 //SSR
//	@GetMapping("/tyhmeleaf")
//	public String dataThy(Model model) {
//		// "/board/tyhmeleaf" 경로로 GET 요청이 발생했을 때 호출
//		// Model 객체를 사용하여 Thymeleaf 템플릿에 데이터를 전달
//		List<BoardVo> boardData = boardDataService.getBoardData();
//		model.addAttribute("data", boardData); // "datum"라는 이름으로 모델에 데이터 추가
//		// index.html에 boardData값을 보내서 html에 있는 for문까지
//		// 다 서버측에서 만들어준 다음에 완성된 html코드를
//		return "tyhmeleaf"; // tyhmeleaf.html 템플릿 파일로 이동 //index 브라우저에게 전달
//	}
//
//	// 웹 브라우저 //CSR
//	@GetMapping("/web")
//	public String dataWeb() {
////		List<BoardVo> boardData = boardDataService.getBoardData();
////		modell.addAttribute("data", boardData);
//		return "web"; // web.html 템플릿 파일로 이동
//	}

/*
 * 클라이언트 사이드(Client-Side) -> 완성된 html 코드를 브라우저에게 준다. -> 페이지소스 봤을 때, <tr>
 * <!--리스트반복하면서 각 데이터 행으로 생성 --> <td>1</td> <!--반복 상태변수--> <td>제목1</td>
 * <td>내용1</td> <td>작성자1</td> <td>2023-09-25 10:23</td>
 * 
 * <tr> <!--리스트반복하면서 각 데이터 행으로 생성 --> <td>2</td> <!--반복 상태변수--> <td>제목2</td>
 * <td>내용2</td> <td>작성자2</td> <td>2023-09-25 10:23</td>
 * 
 * <tr> <!--리스트반복하면서 각 데이터 행으로 생성 --> <td>3</td> <!--반복 상태변수--> <td>제목3</td>
 * <td>내용3</td> <td>작성자3</td> <td>2023-09-25 10:23</td>
 * 
 * 이런 식으로 150개 모두 출력됨.
 */

/*
 * 서버 사이드(Server-Side) -> 브라우저가 html만 받고 따로 데이터를 받아서(ajax사용), 브라우저가 완성된 html 코드를
 * 만든다. -> 실질적으로 페이지소스 봤을때 찍으면 데이터 하나씩 추가됨
 */
