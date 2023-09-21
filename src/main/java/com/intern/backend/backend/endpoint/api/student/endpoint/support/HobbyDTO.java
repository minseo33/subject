package com.intern.backend.backend.endpoint.api.student.endpoint.support;

import lombok.Getter;
import lombok.Setter;

public class HobbyDTO {

    @Getter
    @Setter
    public static class SaveReq {
        private Long studentSeq; // 학생 시퀀스
        private String hobby; // 취미
    }
}
