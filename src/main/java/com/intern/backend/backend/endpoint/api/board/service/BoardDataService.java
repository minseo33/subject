package com.intern.backend.backend.endpoint.api.board.service;

import com.intern.backend.backend.endpoint.api.board.support.BoardVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
   
}
