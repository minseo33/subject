package com.intern.backend.backend.ot.oop.ot;

import com.intern.backend.backend.ot.oop.ot.vehicle.Car;
import com.intern.backend.backend.ot.oop.ot.vehicle.MotorCycle;

public class TestMain {
    public static void main(String[] args) {
        Car car = new Car();
        MotorCycle motorCycle = new MotorCycle();

        Driver driver = new Driver();
        driver.driver(car);
        driver.driver(motorCycle);


    }


    /*public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.moveForward();
        car.moveBackward();

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.start();
        motorCycle.moveForward();
        motorCycle.moveBackward();

        Truck truck = new Truck();
        truck.start();
        truck.moveForward();
        truck.moveBackward();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(motorCycle);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass());
        }

    }*/
}
