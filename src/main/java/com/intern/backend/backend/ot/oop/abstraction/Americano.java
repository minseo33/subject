package com.intern.backend.backend.ot.oop.abstraction;


class Americano extends Coffee { //Coffee의 하위 클래스: 아메리카노 커피
// public Americano(int sugarLevel) {
//     super("아메리카노", sugarLevel);
// }

 @Override
 public void make() {
     System.out.println("아메리카노를 만듭니다.");
 }
}