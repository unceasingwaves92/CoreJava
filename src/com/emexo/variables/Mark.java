package com.emexo.variables;

public class Mark {

    // static variable
    public static final String  SCHOOL_NAME = "DON BOSCO";

    // instance variable
    public int mathematicsMark=90;

    public static void main(String[] args) {
    // invoke main method
        System.out.println(Mark.SCHOOL_NAME);

        // create a object to allocate memory space on instance variable
        Mark ma= new Mark();
        System.out.println(ma.mathematicsMark);

        // local -> temporary variable with no access modifier/anywhere scope within the method
        int science=80;
        System.out.println(science);
    }
}
