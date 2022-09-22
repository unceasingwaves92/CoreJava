package com.emexo.exceptionexample;

public class MainArray {

    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        try {
            obj.array();
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }
}
