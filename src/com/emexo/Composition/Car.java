package com.emexo.Composition;

public class Car {

    private int model;
    private int carNumber;
    private String ownerName;

    private final Engine engine;

    public Car(int model, int carNumber, String ownerName, int engineModel, String engineCompany){
        this.model = model;
        this.carNumber = carNumber;
        this.ownerName = ownerName;
        this.engine = new Engine(engineModel, engineCompany);
    }

    public void getCarDetails(){
        System.out.println("The model number: "+ model);
        System.out.println("The car number: "+ carNumber);
        System.out.println("The owner name: "+ ownerName);
        engine.getEngineDetails();
    }
}
