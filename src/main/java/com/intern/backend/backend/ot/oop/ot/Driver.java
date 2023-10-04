package com.intern.backend.backend.ot.oop.ot;

import com.intern.backend.backend.ot.oop.ot.vehicle.Vehicle;

public class Driver {
    void driver(Vehicle vehicle){
        vehicle.start();
        vehicle.moveForward();
        vehicle.moveBackward();
    }
}
