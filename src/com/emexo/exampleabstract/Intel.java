package com.emexo.exampleabstract;

public class Intel extends Bios{

    public Intel(String manfacturer){
        super(manfacturer);
    }
    @Override
    public void startFlash(String start) {
        System.out.println("Starting intel flash: "+ start);
    }

    @Override
    public void stopFlash(String stop) {
        System.out.println("Stopping intel flash: "+ stop);

    }
}
