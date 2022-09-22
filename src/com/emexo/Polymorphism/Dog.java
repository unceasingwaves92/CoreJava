package com.emexo.Polymorphism;

public class Dog implements Animal{




    @Override
    public void move(int running) {
        System.out.println("Dog running per hour: "+ running);
    }

    @Override
    public void roaring(int sound) {
        System.out.println("Dog barking decimal: "+ sound);
    }
}
