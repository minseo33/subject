package com.intern.backend.backend.endpoint.api.board.support;

import java.util.List;

import lombok.Getter;

@Getter
public class BoardResponse { //넘겨줘야 하는 데이터 묶기위헤 //이게 주머니라고 생각

   private Integer pageSize; //주머니 속
   private Pagination pagination;
   private List<BoardVo> boardData;

   public BoardResponse(Integer pageSize, Pagination pagination, List<BoardVo> boardData) {
      this.pageSize = pageSize;
      this.pagination = pagination;
      this.boardData = boardData;
   }

}

