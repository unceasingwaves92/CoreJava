package com.emexo.multithreading;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()-> {
            System.out.println(Thread.currentThread().getName()+ " Start");
            try {
                Thread.sleep(6000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " End");
        });
        t1.start();
        t1.join();
        System.out.println(Thread.currentThread().getName());
    }
}
