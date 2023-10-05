package com.intern.backend.backend.ot.oop.encapsulation;

public class Coffe {
	
	//private : 자기 자신의 클래스 내에서만 접근 가능하도록하는 접근제어자 
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}


//Coffe a = new b(); //Coffe에 b를 담는 a객체 생성