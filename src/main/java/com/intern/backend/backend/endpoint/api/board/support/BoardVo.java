package com.intern.backend.backend.endpoint.api.board.support;

import java.util.Date;

import lombok.Getter;

//게시판 모델 정의
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
