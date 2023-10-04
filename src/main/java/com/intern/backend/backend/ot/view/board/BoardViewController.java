package com.intern.backend.backend.ot.view.board;

import com.intern.backend.backend.ot.api.board.service.BoardDataService;
import com.intern.backend.backend.ot.api.board.support.BoardDTO;
import com.intern.backend.backend.ot.api.board.support.BoardVo;
import com.intern.backend.backend.ot.support.PagingDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardViewController {
    private final BoardDataService boardDataService;

    public BoardViewController(BoardDataService boardDataService) {
        this.boardDataService = boardDataService;
    }
    @GetMapping("/csr")
    public String csrPaging(Model model, PagingDTO req){
        return "board/csr_paging";
    }
    @GetMapping("/ssr")
    public String boardSsrView(Model model, BoardDTO.SearchReq req){
        List<BoardVo> items = boardDataService.searchBoard(req);
        int totalCnt = boardDataService.searchBoardCnt(req);
        req.setTotalCnt(totalCnt);

        model.addAttribute("items", items);
        model.addAttribute("info", req);
        return "board/ssr_paging";
    }
}
