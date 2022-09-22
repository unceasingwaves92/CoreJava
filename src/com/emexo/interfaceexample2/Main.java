package com.emexo.interfaceexample2;

public class Main {
    public static void main(String[] args) {

        Processor obj = new SandyBridge();
       // SandyBridge bridge = new SandyBridge();
        obj.intelI5Processor("average performance");
        obj.intelI7Processor("good performance");
        Processor.print();
        obj.method();
        System.out.println(Processor.noOfProcessor);
        Processor glenn = new AppleGlenn();
        glenn.intelI5Processor("average glenn performance");
        glenn.intelI7Processor("good glenn performance");
        glenn.method();
        Processor.print();
        System.out.println(Processor.noOfProcessor);

    }


}
