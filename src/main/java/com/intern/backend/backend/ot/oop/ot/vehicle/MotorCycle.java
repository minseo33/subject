package com.intern.backend.backend.ot.oop.ot.vehicle;

public class MotorCycle  implements Vehicle {
    private String name; // 이름
    private String company; // 제조사

    private String type;  // 2륜,  4륜

    @Override
    public void start() {
        System.out.println("바이크 시동");
    }

    @Override
    public void moveForward() {
        System.out.println("바이크 전진");
    }

    @Override
    public void moveBackward() {
        System.out.println("바이크 후진");
    }

    /*public void start(){
        System.out.println("시동");
    }

    public void moveForward(){
        System.out.println("전진");
    }

    public void moveBackward(){
        System.out.println("후진");
    }*/
}
