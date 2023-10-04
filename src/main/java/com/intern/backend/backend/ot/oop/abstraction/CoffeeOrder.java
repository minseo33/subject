package com.intern.backend.backend.ot.oop.abstraction;

//public interface CafeDrinkAbstraction {
//	 
////	public static void order() {
////		System.out.println("주문 해주세요");
////	};
//	
//	 public abstract void make(); //public abstract는 생략 가능
//
//}

// 공통 기능(make)를 interface에 정의

//interface
//- 어떤 객체의 역할만을 정의하여 객체들 간의 관계를 보다 유연하게 연결하는 역할 -> make 역할만 정의함
//	-> 어떤 객체가 수행해야 하는 핵심적인 역할만 규정하고, 실질적인 구현은 해당 인터페이스를 구현하는 각각의 객체들에서 하도록 설계하는것 -> coffee와 tea 객체에서 실질적인 구현을 한다

/* 추상화
- 추상(사전적 의미) : 사물이나 표상을 어떤 성질, 공통성, 본질에 착안하여 그것을 추출하여 파악하는 것 -> 커피, 차, 음료수, 탄산수등을 카페에서 파는 음료로 추상화
- 클래스들의 중요하고 공통된 성질을 추출
	-> coffee와 tea는 cafe의 음료 -> 음료는 만들어야 하는 공통점 -> 카페 음료인 추상적인 객체를, make 속성으로 묶은것
*/



public class CoffeeOrder { // 아메리카노와 라떼 커피를 주문하고 만드는 과정
    public static void main(String[] args) {
        // 아메리카노 주문 및 제조
        Coffee americano = new Americano;
        americano.order(); // 주문
        americano.make();  // 아메리카노 제조
		americano.serve(); // 제공

        // 라떼 주문 및 제조
        Coffee latte = new Latte;
        latte.order(); // 주문
        latte.make();  // 라떼 제조
        latte.serve(); // 제공
    }
}
