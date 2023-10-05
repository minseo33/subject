package com.intern.backend.backend.ot.oop.encapsulation;

/**
 * 캡슐화에 대한 예제를 작성하는 메인 클래스 입니다.
 */

public class EncapsulationMain {
    public static void main(String[] args) {

    	Coffe coffe = new Coffe();
    	
    	//private : 자기 자신의 클래스 내에서만 접근 가능하도록하는 접근제어자 
    	//Coffee클래스의 필드값들이 접근제어자 private으로 선언되어있기에 Getter/Setter메서드를 통해서 접근합니다. 
    	coffe.setName("아이스 아메리카노"); 
    	coffe.setPrice(2500);
    	
    	System.out.println(coffe.getName());
    	System.out.println(coffe.getPrice());
    	
    }
}

/* 캡슐화
 * 변수나 함수를 하나의 클래스로 묶어 외부에서 쉽게 접근하지 못하도록 은닉하는 것 입니다.
 * -> 중요한 데이터를 쉽게 바꾸지 못하도록 할 때 사용합니다.
 * 		-> Coffe클래스의 name과 price를 private로 선언하여 외부 클래스에서 접근 못하게 은닉하는 것 입니다.
 * -> 객체가 제공하는 필드와 메소드를 통해서만 접근이 가능합니다. -> get, set
 * //private : 자기 자신의 클래스 내에서만 접근 가능하도록하는 접근제어자 
 */

//* 자바의 접근 제어자
// public : 접근 제한 없음
// protected: 동일한 패키지 내에 존재하거나 파생 클래스에서만 접근 가능
// default : 아무런 접근 제한자를 명시하지 않으면 default 값이 되며, 동일한 패키지 내에서만 접근 가능
// private: 자기 자신의 클래스 내에서만 접근 가능
