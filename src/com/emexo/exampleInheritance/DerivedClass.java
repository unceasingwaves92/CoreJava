package com.emexo.exampleInheritance;

public class DerivedClass extends BaseClass{

    public DerivedClass(String name){
        super(name);
        System.out.println(noOfPerson);
    }

    // Method overriding in parent method
    public void childClass(String parent){
        System.out.println("no of grand children: "+ parent);
    }
}
