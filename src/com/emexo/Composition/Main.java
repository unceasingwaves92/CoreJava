package com.emexo.Composition;

public class Main {

    public static void main(String[] args) {
        // tightly coupled constructor
        Car car = new Car(11, 9999, "Karthik", 483, "BWM");
        car.getCarDetails();
        System.gc();
    }
}
