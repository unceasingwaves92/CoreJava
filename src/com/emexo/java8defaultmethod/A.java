package com.emexo.java8defaultmethod;

public interface A {
    public default void sound(){
        System.out.println("Volume is A up");
    }

    public static void StaticMethod(){
        System.out.println("Volume is static level");
    }
}
