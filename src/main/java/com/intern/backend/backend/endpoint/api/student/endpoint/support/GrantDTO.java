package com.intern.backend.backend.endpoint.api.student.endpoint.support;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * student 조작을 위한 DTO
 */
public class GrantDTO {
    @Getter
    @Setter
    public static class SaveReq {
        private Long seq; // 시퀀스
        private String name; // 이름
    }
    @Getter
    @Setter
    public static class SearchRes {
        private String name; // 이름
        private Long seq; // 시퀀스
    }
}
