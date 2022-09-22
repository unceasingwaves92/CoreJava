package com.emexo.Polymorphism;

public class Fish implements Animal{


    @Override
    public void move(int running) {
        System.out.println("Fish running per hour: "+ running);
    }

    @Override
    public void roaring(int sound) {
        System.out.println("Fish sound decimal: "+ sound);
    }
}
