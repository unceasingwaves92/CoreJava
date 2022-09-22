package com.emexo.Autoboxing;

public class Calculator {


        // Object format of wrapper class
        // convert primitive data type to the coressponding wrapper/object class
        public int add(Integer input1, Integer input2){

            int output  = input1 + input2;
            return output;
        }


        public static void main(String[] args){
            // Convert primitive data type to convert object format wrapper class
            // local variable within main method
            int value1 = 10;
            int value2 = 20;

            // Manually no need conversion JVM will do automatically conversion
            Calculator cal = new Calculator();
            int response = cal.add(value1, value2);
            System.out.println(response);
        }
}
