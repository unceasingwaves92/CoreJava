package com.emexo.PolymorphismExample;

public class Car implements Petrol{
    @Override
    public void mileage(int mile) {
        System.out.println("Car mileage per hour: "+ mile);
    }
}
