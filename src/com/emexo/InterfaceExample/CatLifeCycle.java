package com.emexo.InterfaceExample;

public interface CatLifeCycle {

    // static variable
    int noOfBreed=3;

    // abstract method - we cant create method body
    void aggressive();

    void speed();

    // Common functionality
    default void nature(){
        System.out.println("Cat family");
    }

}
