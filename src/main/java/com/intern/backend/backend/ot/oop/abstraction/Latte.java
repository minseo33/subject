package com.intern.backend.backend.ot.oop.abstraction;


class Latte extends Coffee { //하위 클래스: 라떼 커피
// public Latte(int sugarLevel) {
//     super("라떼", sugarLevel);
// }

 @Override
 public void make() { //make 메서드를 오버라이드하여 커피를 만드는 동작을 구체화
     System.out.println("라떼를 만듭니다.");
 }
}

//Coffee 클래스를 상속받아서 라떼 커피를 구현