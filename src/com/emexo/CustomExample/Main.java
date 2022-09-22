package com.emexo.CustomExample;

import java.io.IOException;

// Dont use Main name
public class Main {

    // dont declare exception in main method
    public static void main(String[] args) {
        exceptionExample obj = new exceptionExample();
        try {
            obj.read1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
