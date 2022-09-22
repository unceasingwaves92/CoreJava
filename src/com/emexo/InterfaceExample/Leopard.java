package com.emexo.InterfaceExample;


public class Leopard implements CatLifeCycle, CatFamily {
    @Override
    public void aggressive() {
        System.out.println("Leopard is aggressive");
    }

    @Override
    public void speed() {
        System.out.println("Leopard is average speed");

    }

    @Override
    public void sound() {
        System.out.println("Compare to tiger less than leopard");
    }

    @Override
    public void run() {
        System.out.println("Compare to cheetah then leopard is average speed");
    }
}
