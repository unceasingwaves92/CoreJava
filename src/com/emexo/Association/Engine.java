package com.emexo.Association;

public class Engine {

    private String oilPan;

    private String cylinderHead;

    private int cylinderBlock;

    public Engine(String oilPan, String cylinderHead, int cylinderBlock) {
        this.oilPan = oilPan;
        this.cylinderHead = cylinderHead;
        this.cylinderBlock = cylinderBlock;
    }

    public void getEngineDetails() {
        System.out.println("The pan oil is: "+ oilPan);
        System.out.println("The cylinder head is: "+ cylinderHead);
        System.out.println("The cylinder block is: "+ cylinderBlock);
    }
}
