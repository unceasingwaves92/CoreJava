package com.emexo.Polymorphism;

public class Lion implements Animal{


    @Override
    public void move(int running) {
        System.out.println("Lion running per hour: "+ running);
    }

    @Override
    public void roaring(int sound) {
        System.out.println("Lion roaring decimal: "+ sound);
    }
}
