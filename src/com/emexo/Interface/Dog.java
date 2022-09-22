package com.emexo.Interface;

// Using implements keyword to implement the interface in class file
public class Dog implements Animal{
    @Override
    public void run() {
        System.out.println("Dog running");
    }

    @Override
    public void sound() {
        System.out.println("Dog barking");

    }
}
