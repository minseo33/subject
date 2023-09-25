package com.intern.backend.backend.endpoint.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intern.backend.backend.endpoint.api.board.service.BoardDataService;
import com.intern.backend.backend.endpoint.api.board.support.BoardVo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class IndexApiController {
	
	private final BoardDataService boardDataService;

	
    @GetMapping("/api/board") 
    public List<BoardVo> indexApi() {
    	List<BoardVo> boardData = boardDataService.getBoardData(0, 0);
    	return boardData;
    }
    
}
