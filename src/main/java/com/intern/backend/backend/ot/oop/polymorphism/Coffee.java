package com.intern.backend.backend.ot.oop.polymorphism;

class Coffee extends CafeDrink {
    @Override
    public void make() { // CafeDrink 클래스의 make 메서드를 오버라이드
        System.out.println("커피를 만듭니다.");
    }

    public void useCoffeeMachine() {
        System.out.println("커피 머신을 사용합니다.");
    }
}



