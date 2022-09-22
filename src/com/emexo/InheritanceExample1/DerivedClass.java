package com.emexo.InheritanceExample1;

public class DerivedClass extends BaseClass{

    public DerivedClass(int i){
        super(i);
        System.out.println(noOfWheels);
    }

    // method overriding
    @Override
    public void parentMethod() {
        System.out.println("child method");
    }
}
