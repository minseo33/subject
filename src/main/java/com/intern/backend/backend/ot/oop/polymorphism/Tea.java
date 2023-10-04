package com.intern.backend.backend.ot.oop.polymorphism;

class Tea extends CafeDrink {
    @Override
    public void make() { // CafeDrink 클래스의 make 메서드를 오버라이드
        System.out.println("차를 만듭니다.");
    }

    public void useTeaBag() {
        System.out.println("티백을 사용합니다.");
    }
}