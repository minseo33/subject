package com.intern.backend.backend.endpoint.api.board.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.intern.backend.backend.endpoint.api.board.support.BoardVo;

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


    //리스트의 총 게시물 수를 구하는 로직
    public int findAllCount() {
    	return boardData.size();
    }


    // 범위값에 따라서 리스트를 조회
    // csr, ssr 모두 이 메서드를 통해서 범위만큼 리스트를 조회함.
    public List<BoardVo> getRangeBoardData(int startIndex, int pageSize) {
    	int endIndex = startIndex + pageSize; // ex. 0값, 10값 += 10 = endIndex
    	if(endIndex > 150) {
    		endIndex = 150; //최대한의 값을 150으로 설정함 //Pagination의 validation
    	}
    	List<BoardVo> list = boardData.subList(startIndex, endIndex); //subList를 통해 뽑아냄
    	return list;
    	//controller의 List<BoardVo> list = boardDataService.getRangeBoardData(startIndex, pageSize);로 들어옴
    }
}

