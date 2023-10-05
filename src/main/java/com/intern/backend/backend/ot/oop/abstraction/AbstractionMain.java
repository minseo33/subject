package com.intern.backend.backend.ot.oop.abstraction;

public class AbstractionMain { 
	
    public static void main(String[] args) { 
    	Coffee coffee = new Coffee("아메리카노", 10); // Coffee 객체 생성하였습니다.
    	Tea tea = new Tea("쌍화차", 20); // 티 객체 생성하였습니다.
    	
    	//coffee클래스(자식)는 CafeDrink클래스(부모)를 상속 받았기때문에, 
    	//CafeDrink클래스 메소드를 사용 할 수 있습니다.
    	coffee.order(); // 커피 주문 //상속개념
    	coffee.make(); // 커피 제조
    	
    	//tea클래스(자식)도 CafeDrink클래스(부모)를 상속 받았기때문에, 
    	//CafeDrink클래스 메소드를 사용 할 수 있습니다.
    	tea.order(); //커피 주문
    	tea.make(); //커피 제조
    }
}



/* 추상화
- 추상화 : 사물이나 표상을 어떤 성질, 공통성되는 특성을 묶어 이름을 붙이는 것 -> 카페 음료중 만드는 행위를 추상화
- 클래스들의 중요하고 공통된 성질을 추출(공통된 행동, 필드를 묶는다)
	-> coffee와 tea는 cafe의 음료 -> 음료는 만들어야 하는 공통점 -> 카페 음료인 추상적인 객체를, make 속성으로 묶은것입니다.
*/

/*
 * 추상화는 클래스들의 공통적인 부분(make)를 찾아 재사용이 가능한 클래스를 설계
 * 다형성은 공통적인 메소드(kind)로 여러가지 기능을 만들어내는것
 */
