package com.emexo.Interface;

public class Cheetah implements Animal{
    @Override
    public void run() {
        System.out.println("Cheetah is fastest animal");
    }

    @Override
    public void sound() {
        System.out.println("Cheetah sound similar to cat");
    }
}
