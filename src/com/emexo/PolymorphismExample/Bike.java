package com.emexo.PolymorphismExample;

public class Bike implements Petrol{
    @Override
    public void mileage(int mile) {
        System.out.println("Bike is mileage per hour: "+ mile);
    }

}
