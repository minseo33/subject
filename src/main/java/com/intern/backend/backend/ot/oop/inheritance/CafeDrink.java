package com.intern.backend.backend.ot.oop.inheritance;

public class CafeDrink { //상위클래스
	
	public String name; //자식 클래스에서 할당받음
	public int price;
	
	public void parentsCafeMenu() {
		System.out.println("종류 : " + name);
		System.out.println("가격 : " + price);
	}
}