package com.emexo.Inheritance;

public class DerivedClass extends BaseClass{

    public DerivedClass(int i) {
        super(i);
       // parentMethod();
    }

    // Overriding of parent class
    @Override
    public void parentMethod() {
        System.out.println("No of child method");
    }
}
