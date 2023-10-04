package com.intern.backend.backend.ot.oop.inheritance;

//Cafe 클래스
class Cafe {
	public void order() { // 주문을 받는 메서드 정의
		System.out.println("주문해주세요.");
	}

	public void make() { // 음료를 만드는 메서드 정의
		System.out.println("음료를 만듭니다.");
	}
}

// cafe 클래스를 다른 클래스에서 상속하여 재사용하도록