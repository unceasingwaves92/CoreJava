package com.emexo.exceptionexample;

public class ExceptionExample1 {

    public int divide(int input1, int input2){
        int output=0;

        try{
            output = input1/input2;
            // Java 7 single catch block resource
        }catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Rest of the code is executed");
            return output;

        }

    }
}
