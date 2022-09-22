package com.emexo.Interface;

public class Cat implements Animal{
    @Override
    public void run() {
        System.out.println("Cat walking");
    }

    @Override
    public void sound() {
        System.out.println("Meow");

    }
}
