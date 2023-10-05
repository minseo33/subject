package com.intern.backend.backend.ot.oop.polymorphism;

public class Coffee extends CafeDrink{ //CafeDrink 상속받은 Coffee
	
	@Override //kind를 재정의! //다형성이 보장되기 위해서는 하위 클래스 메소드가 반드시 재정의되어야 합니다.
	public void kind() {
		System.out.println("아메리카노를 만들겠습니다.");
	}
	
	
}


