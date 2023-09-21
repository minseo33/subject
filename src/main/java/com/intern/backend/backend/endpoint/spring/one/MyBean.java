package com.intern.backend.backend.endpoint.spring.one;

import org.springframework.stereotype.Component;

// [특징-1] Spring 컨테이너가 관리하는 빈을 생성
@Component
public class MyBean {
    public String print(){
        return "print";




    }
}

/* Spring Bean이란?
	- 컨테이너가 관리하는 자바 객체로써, 컨테이너에 의해 생명주기가 관리되는 객체 의미
	- 컨테이너 안에 들어있는 객체로 필요할 때마다 컨테이너에서 가져와서 사용
*/

/* 생명 주기
	- 객체생성 -> 의존설정 -> 초기화 -> 사용 -> 소멸과정의 생명주기를 가짐
	- 컨테이너가 초기화될 때 먼저 빈 객체를 설정에 맞춰 생성하며 의존 관계를 설정한 뒤,
	  해당 프로세스가 완료되면 빈 객체가 지정한 메소드를 호출해서 초기화 진행
*/

/* @Component
	- Bean Configuration 파일에 Bean을 따로 등록하지 않아도 사용 가능 (빈 등록 자체를 빈 클래스 자체에 할 수 있음) -> 다른 bean을 등록 안해도 클래스에 빈이 등록되어있는것.
	- @Autowired, @Resource 와 비슷한 기능을 수행
** 직접 작성한 Class를 Bean으로 등록하기 위한 어노테이션
*/

/* @Autowired

*/