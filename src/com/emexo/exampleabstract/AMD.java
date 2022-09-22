package com.emexo.exampleabstract;

public class AMD extends Bios{

    // super keyword is implement of super class
    public AMD(String manfacturer){
        super(manfacturer);
    }
    @Override
    public void startFlash(String start) {
        System.out.println("Starting AMD flashing: "+ start);
    }

    @Override
    public void stopFlash(String stop) {
        System.out.println("Stopping AMD flashing: "+ stop);

    }
}
