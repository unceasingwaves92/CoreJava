package com.emexo.exampleInheritance;

// If you want to inherit(Base class) properties or method another class
// Java supports single inheritance because mainly avoid ambiguity (For ex: Inherit multiple base class
// which base class inherit parent method thats why mainly avoid ambiguity so its support single inheritance
// Inherit child class to parent class
// We can use "extends" keyword

public class BaseClass {

    public static final int noOfPerson = 5;

    // Constructor overloading
    // If more than one class same parameter/diff/type
    public BaseClass(){
        System.out.println("Normal person");
    }

    public BaseClass(String name){
        System.out.println("Name of person: "+ name);
    }

    // Method overloading
    // If used more than same class name are diff parameter/type are called method overloading

    public void personDetails(){
        System.out.println("Name of person details");
    }

    public void personDetails(String name){
        System.out.println("Name of person details: "+ name);
    }

    // Method overriding
    // if you want to implement some operation in child class means its nothing but method overriding

    public void parentMethod(String parent){
        System.out.println("No of grandparent: "+ parent);
    }

}
