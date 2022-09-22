package com.emexo.Association;

public class Car {

    private String carColor;

    private String carBrand;

    private int Odometer;

    private final Engine engine;

    public Car(String carColor, String carBrand, int Odometer, Engine engine){
        this.carColor = carColor;
        this.carBrand = carBrand;
        this.Odometer = Odometer;
        this.engine = engine;
    }

    public void getCarDetails(){
        System.out.println("The car color: "+ carColor);
        System.out.println("The brand name: "+ carBrand);
        System.out.println("The car odometer:"+ Odometer);
        engine.getEngineDetails();
    }
}
