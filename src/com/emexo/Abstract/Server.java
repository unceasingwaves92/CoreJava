package com.emexo.Abstract;

public abstract class Server {

    public String name;

    // Parameterized constructor
    public Server(String name){
        this.name = name;
        System.out.println("Sandy bridge server");
    }

    // abstract method
    public abstract void start();

    public abstract void stop();

    // Instance method
    // Common implementations
    public void Storage(){
        System.out.println("SDD hard disk");
    }

    public void Server(){
        System.out.println(name);
    }
}
