package com.emexo.exceptionexample;

import com.emexo.CustomExample.customException;

public class Main {
    public static void main(String[] args) {
        ExceptionExample2 obj = new ExceptionExample2();
        try {
            obj.divide(0,10);
        } catch (customException e) {
            throw new RuntimeException(e);
        }
    }
}
