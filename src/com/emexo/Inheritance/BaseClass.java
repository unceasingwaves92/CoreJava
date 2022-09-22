package com.emexo.Inheritance;

public class BaseClass {


    // constructor overloading
    public BaseClass(){
        System.out.println("Default constructor");
    }

    public BaseClass(int i){
        System.out.println("Parmeterized constructor:"+ i);
    }

    // method overloading
    public void parentMethod(int j){
        System.out.println("no of parent method:"+ j);
    }

    public void parentMethod(float i){
        System.out.println("no of float parent method:"+ i);
    }

    // method overriding
    public void parentMethod()  {
        System.out.println("method overriding");

    }
}
