package com.intern.backend.backend.ot.oop.abstraction;

//main에서 생성되어 실행
public class Coffee extends CafeDrink { //Coffee의 하위 클래스: 아메리카노 커피

	 public Coffee(String name, int sugarLevel) { //name과 sugarLevel을 갖는 생성자
		super(name, sugarLevel); //CafeDrink 클래스에 name과 sugarLevel 값을 전달합니다.
	}

	 // CafeDrink(추상클래스)에 있는 추상메서드를 하위클래스(Coffee)에서 재정의 반드시 해야합니다.
	 //다형성 보장
	@Override
	public void make() { // make메서드 CafeDrink에서 상속받음
		System.out.println("아메리카노");
	}
}

//추상클래스로 선언하면 선언한 추상클래스 내부에 추상 메소드를 구현가능. 
//구현한 추상클래스를 상속받으면 추상클래스 내부에 정의한 추상메소드는 하위클래스에서 재정의(오버라이딩) 해야함.

/* @Override
- 상속받은 하위 클래스가 상위 클래스의 메소드를 동일하게 정의해 동작을 구현하는 것
	-> Coffee가 CafeDrink의 make메소드를 정의하고, 동작을 구현
*/