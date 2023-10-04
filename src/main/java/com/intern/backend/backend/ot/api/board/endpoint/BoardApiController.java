package com.intern.backend.backend.ot.api.board.endpoint;

import com.intern.backend.backend.ot.api.board.service.BoardDataService;
import com.intern.backend.backend.ot.api.board.support.BoardDTO;
import com.intern.backend.backend.ot.api.board.support.BoardVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class BoardApiController {
    private final BoardDataService boardDataService;

    public BoardApiController(BoardDataService boardDataService) {
        this.boardDataService = boardDataService;
    }

    @GetMapping("/board/search")
    public BoardDTO.SearchReq search(BoardDTO.SearchReq req){
        List<BoardVo> items = boardDataService.searchBoard(req);
        int totalCnt = boardDataService.searchBoardCnt(req);
        req.setTotalCnt(totalCnt);
        req.setItems(items);
        return req;
    }
}
