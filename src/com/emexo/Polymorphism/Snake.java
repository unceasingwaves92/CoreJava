package com.emexo.Polymorphism;

public class Snake implements Animal{
    @Override
    public void move(int running) {
        System.out.println("Snake running per hour: "+ running);
    }

    @Override
    public void roaring(int sound) {
        System.out.println("Snake sound decimal: "+ sound);
    }
}
