package com.intern.backend.backend.endpoint.spring.one;

import org.springframework.stereotype.Component;

// [특징-1] Spring 컨테이너가 관리하는 빈을 생성
@Component
public class MyBean {
    public String print(){
        return "print";
    }
}

