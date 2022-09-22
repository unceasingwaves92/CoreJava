package com.emexo.Composition;

public class Engine {

    private int engineModel;
    private String engineCompany;

    public Engine(int engineModel, String engineCompany){

        this.engineModel = engineModel;
        this.engineCompany = engineCompany;

    }

    public void getEngineDetails(){
        System.out.println("The engine model: "+ engineModel);
        System.out.println("The engine company: "+ engineCompany);
    }
}
