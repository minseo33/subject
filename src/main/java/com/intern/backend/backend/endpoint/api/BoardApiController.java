package com.intern.backend.backend.endpoint.api;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intern.backend.backend.endpoint.api.board.service.BoardDataService;
import com.intern.backend.backend.endpoint.api.board.support.BoardResponse;
import com.intern.backend.backend.endpoint.api.board.support.BoardVo;
import com.intern.backend.backend.endpoint.api.board.support.Pagination;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class BoardApiController {

	private final BoardDataService boardDataService;

	@PostMapping("/api/board")
	public BoardResponse indexApi(@RequestBody Map<String, Integer> map) {
		// map key-value값으로 이루어진 json데이터
		int page = map.get("page");
		int pageSize = map.get("pageSize");

		// 총 게시물 수를 구하는 로직을 생성
		int totalCnt = boardDataService.findAllCount();

		// Pagination 클래스, 즉, 총 게시물 수와 현재 페이지등을 전달하는 로직 생성
		Pagination pagination = new Pagination(totalCnt, page, pageSize);

		int startIndex = pagination.getStartIndex();

		// 리스트 가져오기(List) //얼만큼의 게시물 가져올지 설정
		// 1부터 10번째까지 뽑아낸다 //0값, 10값 //리스트는 0부터 시작 -> 게시물 1번
		List<BoardVo> boardData = boardDataService.getRangeBoardData(startIndex, pageSize);

		// 요청이 들어와서 응답해줘야하는 데이터
		// 넘겨줘야 하는 데이터 boardResponse로 묶음
		BoardResponse boardResponse = new BoardResponse(pageSize, pagination, boardData);

		return boardResponse; // 생성된 객체 boardResponse 브라우저에게 던짐
		// 브라우저는 이 데이터로 작업 
	}

}

