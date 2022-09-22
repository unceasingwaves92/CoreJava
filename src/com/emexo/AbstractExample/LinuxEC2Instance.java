package com.emexo.AbstractExample;

public class LinuxEC2Instance extends SecurityGroup{

    public LinuxEC2Instance(int port){
        super(port);
    }

    @Override
    public void inbound() {
        System.out.println("Allow incoming network in linux");
    }

    @Override
    public void outbound() {
        System.out.println("Allow outgoing network in linux");
    }
}
