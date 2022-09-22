package com.emexo.Autoboxing;

public class Wrapper {

     // Instance variable
     // Wrapper class
    public Byte byteValue;
    public Short shortValue;
    public Integer intValue;
    public Long longValue;
    public Float floatValue;
    public Double doubleValue;
    public Boolean booleanValue;
    public Character charValue;

    // Parameterized constructor

    public Wrapper(Byte b, Short sh, Integer it, Long ln, Float fl, Double db, Boolean bl, Character ch) {
        this.byteValue = b;
        this.shortValue = sh;
        this.intValue = it;
        this.longValue = ln;
        this.floatValue = fl;
        this.doubleValue = db;
        this.booleanValue = bl;
        this.charValue = ch;

    }

    // Print instance method
    public void getWrapperDetails() {
        System.out.println(byteValue + ":" + shortValue + ":" + intValue + ":" + longValue + ":" + floatValue + ":"
                + doubleValue + ":" + booleanValue + ":" + charValue);
    }





}
