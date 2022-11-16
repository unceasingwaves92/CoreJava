package com.emexo.multithreading;

public class RunnableMain {

    public static void main(String[] args) {

        SharedClass sharedClass = new SharedClass();
        RunnableTask task= new RunnableTask(sharedClass);

        // creating new thread
        Thread t1 = new Thread(task);
        // Runnable state
        t1.start();

        Thread t2 = new Thread(task);
        t2.setPriority(10);
        t2.start();
       // System.out.println(Thread.currentThread().getName());
    }
}
