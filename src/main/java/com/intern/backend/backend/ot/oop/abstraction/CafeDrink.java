package com.intern.backend.backend.ot.oop.abstraction;

public abstract class CafeDrink { //추상화 커피 클래스
	private String name; //이름
	private int sugarLevel; //설탕 농도

	//Coffee클래스의 생성자 
	public CafeDrink(String name, int sugarLevel) { //값을 넘겨받습니다.
		this.name = name; //넘겨받은 값 Coffee 필드 name에 대입
		this.sugarLevel = sugarLevel;
	}

	public void order() {  //일반 메소드(Coffee 클래스 내의 있는 메소드)
		System.out.println("종류는?" + this.name);
	}

	//음료를 만드는 추상 메서드로 정의를 했습니다. //함수 선언만 되어있고 구현부가 없는 메서드
	//음료는 달라도 만드는 공통 메서드로,
	//make 메서드를 오버라이딩하여 음료를 만드는 동작을 각 자식클래스에서 구체화합니다.
	public abstract void make(); //자식클래스에서 재정의 하기 때문에 public 사용합니다.
	//public abstract void order(); //추상메소드 복수 가능 //자식들의 부모는 1개만 존재해야한다.

}

//추상클래스를 사용함으로써, 추상메소드를 사용 할 수 있다. -> 추상 클래스는 추상 메소드를 가지지 않아도 상관없지만, 
//추상메소드를 가지는 클래스는 추상클래스가 되어야 한다.

