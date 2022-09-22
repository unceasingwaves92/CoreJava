package com.emexo.Association;

public class Main {

    public static void main(String[] args) {
        // loosely coupled constructor
        Engine engine = new Engine("Castrol","LPG", 2);
        Car car = new Car("Blue", "BMW", 10000, engine);
        car.getCarDetails();
    }
}
