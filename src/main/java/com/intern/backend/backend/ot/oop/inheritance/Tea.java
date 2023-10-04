package com.intern.backend.backend.ot.oop.inheritance;

class Tea extends Cafe { //Tea 클래스 (Cafe 클래스를 상속받는다)
	@Override
	public void make() { //상위 클래스의 특성을 하위 클래스에서 재사용(make)
		System.out.println("차를 제조합니다.");
	}

	public void useTeaBag() { //cafe 클래스에 없는 메서드 추가 생성 //자식클래스(tea)에서만 사용가능
		System.out.println("티백을 사용합니다.");
	}
}

