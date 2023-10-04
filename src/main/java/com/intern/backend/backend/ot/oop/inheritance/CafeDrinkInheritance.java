package com.intern.backend.backend.ot.oop.inheritance;

public class CafeDrinkInheritance { //coffee와 tea를 만드는 과정
 public static void main(String[] args) {
     Coffee customerCoffee = new Coffee(); // customerCoffee 객체 생성
     System.out.println("Coffee 클래스:");
     customerCoffee.order(); // 커피 주문하고
     customerCoffee.make();  // 커피 만들고
     customerCoffee.useCoffeeMachine(); // Coffee 클래스의 특수한 메서드(useCoffeeMachine) 호출 //커피머신사용

     // Tea 객체 생성
     Tea customerTea = new Tea();
     System.out.println("\nTea 클래스:");
     customerTea.order(); // 차 주문하고
     customerTea.make();  // 만들고
     customerTea.useTeaBag(); // Tea 클래스의 특수한 메서드(useTeaBag) 호출 //티백 사용
 }
}

// - 부모의 특징을 자식이 물려받는것