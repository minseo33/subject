package com.intern.backend.backend.ot.api.board.support;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 게시판 endpoint dto
 */
public class BoardDTO {
    @Getter
    @Setter
    public static class SearchReq extends PageVo {
        private String name;
        private List<BoardVo> items;
    }
}
