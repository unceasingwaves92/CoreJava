package com.emexo.Abstract;

public class WindowsServer extends Server {

    public WindowsServer(String name){
        super(name);
    }
    @Override
    public void start() {
        System.out.println("Start windows server");
    }

    @Override
    public void stop() {

        System.out.println("Stop windows server");

    }
}
