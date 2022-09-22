package com.emexo.ExceptionHandling;

import java.util.function.DoubleToIntFunction;

public class multipleCatch {

    public int multipleCatch(int n1, int n2) throws Exception {
        int data = 0;
        try {
            data = n1 / n2;



        // order of hierachy

        }catch(ArithmeticException ex){
            ex.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }catch(NullPointerException ex){
            ex.printStackTrace();
        }catch(java.lang.Exception ex){
            ex.printStackTrace();

        }

        System.out.println("The data value: "+ data);
        return data;

    }
}
