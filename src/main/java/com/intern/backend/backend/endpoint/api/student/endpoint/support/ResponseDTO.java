package com.intern.backend.backend.endpoint.api.student.endpoint.support;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 다형성을 위해 Generic Type T 를 사용
 * @param <T>
 */
@Getter
public class ResponseDTO<T> {
    private boolean status;// 응답상테
    private String message  = "success"; // 응답 메세지


    /**
     * 목록형 데이터
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<T> list;

    /**
     * 객체형 데이터
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;


    public ResponseDTO() {
    }
    /**
     * 목록 조회 경우
     * @param list
     */
    public ResponseDTO(List<T> list) {
        this.list = list;
        if(this.list == null){
            this.list = new ArrayList<T>();
        }
        if(this.list.size() == 0){
            message = "조건에 만족하는 데이터가 없습니다.";
        }
    }

    /**
     * 메세지 전달 경우
     * 메시지가 변경되어야 하는 경우는 에러로 간주한다.
     * @param message
     */
    public ResponseDTO(String message) {
        this.message = message;
        this.status = false;
    }
}
