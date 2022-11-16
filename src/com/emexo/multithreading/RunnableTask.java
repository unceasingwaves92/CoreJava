package com.emexo.multithreading;

public class RunnableTask implements Runnable{

    public SharedClass sharedClass;
    public RunnableTask(SharedClass sharedClass) {
        this.sharedClass=sharedClass;
    }

    @Override
    public void run() {
       sharedClass.SharedMethod();

    }
}
