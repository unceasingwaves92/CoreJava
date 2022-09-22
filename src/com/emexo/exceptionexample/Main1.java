package com.emexo.exceptionexample;

import com.emexo.CustomExample.customException;

import java.io.IOException;

public class Main1 {

    public static void main(String[] args) {
        ExceptionExample3 obj = new ExceptionExample3();
        try {
            obj.read();

        } catch (CustomException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
