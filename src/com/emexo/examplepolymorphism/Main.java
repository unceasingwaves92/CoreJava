package com.emexo.examplepolymorphism;

public class Main {

    public static void main(String[] args) {
        SecurityGroup obj = new SecurityGroup();
        CloudWinEC2 windows = new CloudWinEC2();
        CloudLinEC2 linux = new CloudLinEC2();
        CloudServerEC2 server = new CloudServerEC2();
        obj.generateSG();
        obj.existingSecurityGroup(windows, "windows.pem");
        obj.newSecurityGroup(windows, "newwindows.pem");
        obj.existingSecurityGroup(linux, "linux.pem");
        obj.newSecurityGroup(linux, "newlinux.pem");
        obj.existingSecurityGroup(server, "windows.pem");
        obj.newSecurityGroup(server, "newlinux.pem");
    }
}
