package com.intern.backend.backend.ot.api.board.support;

import lombok.Getter;

import java.util.Date;

@Getter
public class BoardVo {
    private String subject; // 제목
    private String contents; // 내용
    private String writer; // 작성자
    private Date registerTime; // 작성 일시

    public BoardVo(String subject, String contents, String writer, Date registerTime) {
        this.subject = subject;
        this.contents = contents;
        this.writer = writer;
        this.registerTime = registerTime;
    }
}
