package com.emexo.PolymorphismExample;

public class Truck implements Petrol{
    @Override
    public void mileage(int mile) {
        System.out.println("Truck mileage per hour: "+ mile);
    }
}
