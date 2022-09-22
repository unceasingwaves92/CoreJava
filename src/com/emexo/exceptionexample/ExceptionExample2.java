package com.emexo.exceptionexample;

import com.emexo.CustomExample.customException;

public class ExceptionExample2 {

    public int divide(int n1, int n2) throws customException {
        int output = 0;
        try {
            output = n1 / n2;
            throw new CustomException();

        } catch (CustomException e) {
            throw new customException();
        }
        finally{
            System.out.println("Rest of the code is executed");
            return output;
        }
    }
}
