package com.emexo.Unboxing;

public class Calculator {

    public int add(int input1, int input2){
        // primitive data type
        // convert wrapper class from main method to corresponding primitive data type
        int output = input1 + input2;
        return output;
    }

    public static void main(String[] args) {
        // Object format wrapper class
        Integer value1 = 100;
        Integer value2 = 200;

        Calculator cal = new Calculator();

        int response = cal.add(value1, value2);
        System.out.println(response);

    }

}
