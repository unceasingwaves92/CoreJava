package com.emexo.InterfaceExample;

public class Cheetah implements CatLifeCycle, CatFamily{
    @Override
    public void aggressive() {
        System.out.println("Cheetah is not aggressive");
    }

    @Override
    public void speed() {
        System.out.println("Cheetah is fastest animal");

    }

    @Override
    public void sound() {
        System.out.println("Sound is not good");
    }

    @Override
    public void run() {
        System.out.println("Cheetah running is 100Km perhour");
    }
}
