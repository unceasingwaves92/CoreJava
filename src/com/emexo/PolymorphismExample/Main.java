package com.emexo.PolymorphismExample;

public class Main {

    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();
        Petrol bike = new Bike();
        station.shell(bike,50);
    }
}
