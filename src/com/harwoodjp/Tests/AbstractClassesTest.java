package com.harwoodjp.Tests;

import com.harwoodjp.Classes.Cat;
import com.harwoodjp.Classes.Vehicle;

public class AbstractClassesTest {
    public static void run() {
        Cat mocha = new Cat("Mocha");
        mocha.tellAJoke();
        mocha.sayHello();
        mocha.makeNoise();
        /* static subclass instantiation */
        Vehicle.Car myCar = new Vehicle.Car();
        /* non-static subclass instantiation */
        Vehicle myVehicle = new Vehicle();
        Vehicle.Boat myBoat = myVehicle.new Boat();
    }
}
