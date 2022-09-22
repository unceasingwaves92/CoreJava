package com.emexo.AbstractExample;

public class WindowsEC2Instance extends SecurityGroup{

    public WindowsEC2Instance(int port){
        super(port);
        System.out.println(noOfPort);

    }


    @Override
    public void inbound() {
        System.out.println("Allow incoming network in windows");
    }

    @Override
    public void outbound() {
        System.out.println("Allow outgoing network in windows");
    }
}
