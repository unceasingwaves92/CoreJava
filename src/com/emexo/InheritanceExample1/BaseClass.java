package com.emexo.InheritanceExample1;

public class BaseClass {

    public static final int noOfDoors=4;
    public static final int noOfWheels=2;

    // constructor overloading
    public BaseClass() {
        System.out.println("Default constructor");
    }
    public BaseClass(int i){
        System.out.println("The parameterized constructor: "+ i);
    }

    public BaseClass(float j){
        System.out.println("The parameterized constructor: "+ j);
    }

    // method overloading
    public void parentMethod(){
        System.out.println("Parent method");
    }

    public void parentMethod(int i){
        System.out.println("Parent method with argument");
    }

    public void parentMethod(float j){
        System.out.println("Parent method with argument");
    }

}
