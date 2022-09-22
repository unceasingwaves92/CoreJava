package com.emexo.Abstract;

public class TestMain {

    public static void main(String[] args) {

        Server w = new WindowsServer("Windows");
        w.start();
        w.stop();
        w.Storage();
        w.Server();

        Server l = new LinuxServer("Linux");
        l.start();
        l.stop();
        l.Storage();
        l.Server();


    }
}
