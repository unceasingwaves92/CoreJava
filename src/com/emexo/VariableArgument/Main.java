package com.emexo.VariableArgument;

public class Main {

    public static void main(String[] args) {
        VarArgsExample obj = new VarArgsExample();
        obj.method(1, 2, 3);
        System.out.println("*******************");
        obj.method1(1,2,3,5);
    }
}
