package com.emexo.Interface;

// common functionality and different implementations
// We can't create constructor and object
public interface Animal {

    // static variable
    int noOfanimals=4;

    // abstract method - declare method only there is no method body
    // if you creating one interface that is called functional interface
    void run();
    // Inside interface create any variable by default is public, static, final, abstract
    void sound();

    // default method using to avoid for break all the existing implementation methods like
    // lambda, streaming, collections, support. Java 8 supports default & static.
    // Java 11 supports private method
    default void print() {
        System.out.println("print sound and run");
    }
    static void animalprint() {
        System.out.println("animal print");
    }

}
