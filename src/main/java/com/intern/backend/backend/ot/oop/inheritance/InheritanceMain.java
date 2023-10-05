package com.intern.backend.backend.ot.oop.inheritance;

/*상속 */

public class InheritanceMain { // coffee와 tea를 만드는 과정
	public static void main(String[] args) {
		Coffee coffee = new Coffee("아이스 아메리카노", 2500, 10, "Tall", false); // Coffee 객체 생성
		System.out.println("부모클래스의 메서드 호출 - coffee");
		coffee.parentsCafeMenu(); // Coffee 클래스가 CafeDrink클래스를 상속받았기때문에 CafeDrink클래스의 메소드를 호출할 수 있습니다.

		System.out.println("==================================");

		System.out.println("자식클래스 메서드 호출 - coffee");
		coffee.CoffeeMenu(); // 자기 자신 즉, Coffee클래스의 메서드를 직접 호출.

		System.out.println("==================================");

		Tea tea = new Tea("쌍화차", 5500, 1, "Small", true); // customerCoffee 객체 생성
		System.out.println("부모클래스의 메서드 호출 - tea");
		tea.parentsCafeMenu(); // Coffee 클래스가 CafeDrink클래스를 상속받았기때문에 CafeDrink클래스의 메소드를 호출할 수 있습니다.

		System.out.println("==================================");

		System.out.println("자식클래스 메서드 호출 - - tea");
		tea.TeaMenu(); // 자기 자신 즉, tea클래스의 메서드를 직접 호출.

	}
}

/*
 * 상속 
 * - 자식클래스가 부모의 변수 및 메서드를 상속받아 활용할 수 있는 것 입니다. 
 * - 부모가 자식에게 변수/메서드를 상속해주면 자식은 부모가 가지고 있는 상태/동작을 모두 활용 할 수 있습니다. 
 * - extends 키워드를 활용하여 상속받습니다.
 * 
 */