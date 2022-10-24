package com.emexo.java8defaultmethod;

public class ABImplExample implements A,B{

    @Override
    public void sound() {
        A.super.sound();
    }
}

