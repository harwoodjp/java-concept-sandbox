package com.harwoodjp.Classes;

public class Vehicle {

    public static class Car extends Vehicle {
        void makeNoise() {
            System.out.println("Vroom...");
        }
    }

    public class Boat extends Vehicle {
        void makeNoise() {
            System.out.println("Whirrrr...");
        }

    }

}
