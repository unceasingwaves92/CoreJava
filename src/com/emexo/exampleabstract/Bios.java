package com.emexo.exampleabstract;

public abstract class Bios {

    public String manfacturer;

    public Bios(String manufacturer){
        this.manfacturer = manufacturer;
        System.out.println("The company name: "+ manufacturer);

    }

    // abstract method only not method body
    public abstract void startFlash(String start);

    public abstract void stopFlash(String stop);

    public void OEM(){
        System.out.println("OEM manufacturer");
    }
}
