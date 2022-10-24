package com.emexo.java8defaultmethod;

public interface B {

    public default void sound(){
        System.out.println("Volume is B up");
    }

    public static void StaticMethod(){
        System.out.println("Headset is working");
    }
}
