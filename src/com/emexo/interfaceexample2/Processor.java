package com.emexo.interfaceexample2;

public interface Processor {

    int noOfProcessor = 2;

    void intelI5Processor(String norPerf);

    void intelI7Processor(String goodPerf);

    default void method(){
        System.out.println("Welcome to processor family");
    }

    static void print() {
        System.out.println("Checked performance level");
    }
}
