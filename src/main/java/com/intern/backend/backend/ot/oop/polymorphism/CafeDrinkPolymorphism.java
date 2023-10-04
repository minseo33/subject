package com.intern.backend.backend.ot.oop.polymorphism;

/**
 * 다형성에 대한 예제를 작성하는 메인 클래스 입니다.
 */


//물론, 앞서 제공한 코드를 참고하여 다형성 예제를 작성해보겠습니다. 이번에는 커피와 차를 주문하는 예제를 통해 다형성을 보여줄 것입니다.


public class CafeDrinkPolymorphism {
    public static void main(String[] args) {
        
//        CafeDrink customerDrink = new Coffee(); // 다형성을 이용한 객체 생성
//        customerDrink.order(); // Coffee 클래스의 order 메서드 호출
//        customerDrink.make(); // Coffee 클래스의 make 메서드 호출
//        // myDrink.useCoffeeMachine(); // 컴파일 오류: CafeDrink 클래스에는 useCoffeeMachine 메서드가 없음
//
//        customerDrink = new Tea();
//        customerDrink.order(); // Tea 클래스의 order 메서드 호출
//        customerDrink.make(); // Tea 클래스의 make 메서드 호출
//        // myDrink.useTeaBag(); // 컴파일 오류: CafeDrink 클래스에는 useTeaBag 메서드가 없음

        // 각각의 객체를 직접 생성하여 메서드 호출
        Coffee customerCoffee = new Coffee();
        customerCoffee.order();
        customerCoffee.make();
        customerCoffee.useCoffeeMachine();

        Tea customerTea = new Tea();
        customerTea.order();
        customerTea.make();
        customerTea.useTeaBag();
    }
}

//이 코드에서 CafeDrink 클래스는 주문(order)과 음료 만들기(make) 메서드를 가지고 있습니다.
//Coffee 클래스와 Tea 클래스는 각각 CafeDrink 클래스를 상속받아 make 메서드를 오버라이드하고, 고유한 메서드를 추가합니다.
//
//PolymorphismExample 클래스에서는 다형성을 이용하여 myDrink라는 변수를 생성하고, 이 변수를 통해 order 및 make 메서드를 호출합니다.
//myDrink는 Coffee 객체 또는 Tea 객체를 참조할 수 있으며, 실행 시에 실제로 참조하는 객체의 메서드가 호출됩니다. 이것이 다형성을 나타내는 핵심입니다.
//
//또한 각각의 객체를 직접 생성하여 메서드를 호출하는 방법도 있습니다.