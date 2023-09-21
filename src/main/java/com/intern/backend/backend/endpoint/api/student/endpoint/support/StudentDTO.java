package com.intern.backend.backend.endpoint.api.student.endpoint.support;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * student 조작을 위한 DTO
 */
public class StudentDTO {
    @Getter
    @Setter
    public static class SaveReq {
        private String name; // 학생명
        private Integer age; // 나이
    }

    @Getter
    @Setter
    public static class SearchReq {
        private String name; // 학생명
        private Integer age; // 나이
    }

    @Getter
    @Setter
    public static class SearchRes {
        private String name; // 학생명
        private Integer age; // 나이
        private List<String> hobby;
    }
}
