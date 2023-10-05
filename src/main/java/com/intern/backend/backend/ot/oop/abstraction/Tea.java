package com.intern.backend.backend.ot.oop.abstraction;

public class Tea extends CafeDrink { //Coffee의 하위 클래스: 쌍화차 티
	
	public Tea(String name, int sugarLevel) { //name과 sugarLevel을 갖는 생성자
		super(name, sugarLevel); //CafeDrink 클래스에 name과 sugarLevel 값을 전달합니다.
	}

	// CafeDrink(추상클래스)에 있는 추상메서드를 하위클래스(Coffee)에서 재정의 반드시 해야합니다.
	@Override
	public void make() {
		System.out.println("쌍화차");
	}
	
	
}