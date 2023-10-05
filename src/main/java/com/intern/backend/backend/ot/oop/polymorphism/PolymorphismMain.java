package com.intern.backend.backend.ot.oop.polymorphism;

/**
 * 다형성에 대한 예제를 작성하는 메인 클래스 입니다.
 */


public class PolymorphismMain {
	
	public static void main(String[] args) {
		CafeDrink coffee = new Coffee(); // CafeDrink(부모)에 Coffee(자식)를 생성했습니다.
		CafeDrink tea = new Tea(); // CafeDrink에 tea를 생성했습니다.
		//즉 CafeDrink클래스의 coffee,tea를 담을수있다
		//Coffee와 tea를 생성하는데, 각각의 Coffee와 tea 클래스가 CafeDrink를 상속받았기 때문에

//		CafeDrink cafeDrink = new CafeDrink();
//		cafeDrink.kind();
		coffee.kind();


		
//		cafeDrink.kind();
		tea.kind();

	}
}

/* 다형성
- 부모&자식 상속 관계에 있는 클래스에서 상위클래스가 동일한 메시지로 하위 클래스들을 서로 다르게 동작시키는 것 입니다.
*/