package com.emexo.AbstractExample;

public class Main {

    public static void main(String[] args) {
        SecurityGroup sg = new WindowsEC2Instance(22);
        sg.inbound();
        sg.outbound();
        sg.commonSG();
        System.out.println("The port:"+ sg.port);

        SecurityGroup sg1 = new LinuxEC2Instance(80);
        sg1.inbound();
        sg1.outbound();
        sg1.commonSG();
       // sg1.getSGDet();
        System.out.println("The port:"+ sg1.port);

    }
}
