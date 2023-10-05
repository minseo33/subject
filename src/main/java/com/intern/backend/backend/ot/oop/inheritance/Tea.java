package com.intern.backend.backend.ot.oop.inheritance;

public class Tea extends CafeDrink{ //CafeDrink의 하위 클래스 //extends를 사용하여 상속받음
	
	private int sugarLevel;
	private String size;
	private Boolean hotCold;
	
	public Tea(String name, int price, int sugarLevel, String size, Boolean hotCold) {
		super.name = name; //CafeDrink의 name //super()를 통해 부모클래스 객체에 할당
		super.price = price; //CafeDrink의 price
		this.sugarLevel = sugarLevel;
		this.size = size;
		this.hotCold = hotCold; //뜨거움유무
	}
	
	public void TeaMenu() {
		System.out.println("설탕농도 : " + sugarLevel);
		System.out.println("사이즈 : " + size);
		System.out.println("뜨거움유무 : " + hotCold);
	}
	
}
