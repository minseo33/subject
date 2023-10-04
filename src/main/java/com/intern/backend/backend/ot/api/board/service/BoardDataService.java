package com.intern.backend.backend.ot.api.board.service;

import com.intern.backend.backend.ot.api.board.support.BoardDTO;
import com.intern.backend.backend.ot.api.board.support.BoardVo;
import com.intern.backend.backend.ot.support.PagingDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BoardDataService {
    private List<BoardVo> boardData;

    public BoardDataService() {
        this.boardData = new ArrayList<>();
        for(int i = 0; i < 150; i++){
            boardData.add(new BoardVo("제목" + (i + 1), "내용" + (i + 1) , "작성자" + (i + 1), new Date()));
        }
    }

    /**
     * 게시판 데이터 전달
     * @return
     */
    public List<BoardVo> getBoardData() {
        // data 에 대한 비지니스 로직을 추가하셔도 됩니다.
        return boardData;
    }

    /**
     * req 정보에 따라 보드 데이터를 정제해서 리턴하는 함수
     * @param req
     * @return
     */
    public List<BoardVo> search(PagingDTO req) {
        return boardData.subList(req.getPage() , req.getPage() * req.getPerPage());
    }


    public List<BoardVo> searchBoard(BoardDTO.SearchReq req) {

        List<BoardVo> filter = boardData.stream().filter(item -> {
            if(req.getName() != null && !"".equals(req.getName())){
                return item.getWriter().contains(req.getName());
            }
            return true;
        }).collect(Collectors.toList());

        int startIndex = (req.getPage() - 1) * req.getPerPage();
        int endIndex = Math.min(startIndex + req.getPerPage(), filter.size());

        return filter.subList(startIndex, endIndex);
    }

    public int searchBoardCnt(BoardDTO.SearchReq req) {
        List<BoardVo> filter = boardData.stream().filter(item -> {
            if(req.getName() != null && !"".equals(req.getName())){
                return item.getWriter().contains(req.getName());
            }
            return true;
        }).collect(Collectors.toList());
        return filter.size();
    }
}
