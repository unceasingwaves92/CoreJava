package com.emexo.multithreading;

public class ThreadClass extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().getName()+ " Start");
        try {
            Thread.sleep(100);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println(Thread.currentThread().getName()+ " End");
        }
    }

}
