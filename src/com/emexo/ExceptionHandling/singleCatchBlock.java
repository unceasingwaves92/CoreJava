package com.emexo.ExceptionHandling;


public class singleCatchBlock {

    public String string(String n)
    {


        try {
            System.out.println("The length of: "+ n.length());


        }catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
        System.out.println("Rest of the code");
        return n;
    }

    public int divide(int input1, int input2){
        int output = 0;

        try {
            output = input1 / input2;
        }catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }

        System.out.println("output: "+ output);
        return output;
    }


}
