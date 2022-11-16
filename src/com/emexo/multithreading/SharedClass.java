package com.emexo.multithreading;

public class SharedClass {

    public synchronized void SharedMethod() {

        System.out.println(Thread.currentThread().getName()+ " Start");
        try {
            Thread.sleep(600);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+ " End");

    }
}
