package com.emexo.multithreading;

public class ThreadMain {

    public static void main(String[] args) {
        ThreadClass t1= new ThreadClass();
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
