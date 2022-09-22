package com.emexo.InterfaceExample;

public class Tiger implements CatLifeCycle, CatFamily{
    @Override
    public void aggressive() {
        System.out.println("Tiger is more aggressive");
    }

    @Override
    public void speed() {
        System.out.println("Tiger is speed");
    }

    @Override
    public void sound() {
        System.out.println("Tiger is more roaring");
    }

    @Override
    public void run() {
        System.out.println("Tiger running 40kmh perhour");

    }
}
