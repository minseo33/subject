package com.intern.backend.backend.ot.oop.abstraction;

abstract class Coffee { //추상화된 커피 클래스
	private String name; //이름
	private int sugarLevel; //설탕 농도

	public Coffee(String name, int sugarLevel) {
		this.name = name;
		this.sugarLevel = sugarLevel;
	}

	public void order() { //커피 주문을 받는 동작
		System.out.println(name + " 커피 주문이 접수되었습니다.");
	}

	public abstract void make(); // 커피 만들기 메서드 (하위 클래스에서 구현) //커피는 달라도 만드는 공통 메서드
//	 make 메서드를 오버라이드하여 커피를 만드는 동작을 구체화

	public void serve() { // 커피를 제공하는 동작
		System.out.println(name + " 준비되었습니다." + sugarLevel + "맞춰서 맛있게 드세요!");
	}
}
