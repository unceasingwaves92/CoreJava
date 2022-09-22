package com.emexo.Abstract;

public class LinuxServer extends Server {

    public LinuxServer(String name){

        super(name);
    }
    @Override
    public void start() {

        System.out.println("Start linux server");

    }

    @Override
    public void stop() {

        System.out.println("Stop linux server");
    }
}
