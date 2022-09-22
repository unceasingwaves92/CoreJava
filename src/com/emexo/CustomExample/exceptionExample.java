package com.emexo.CustomExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exceptionExample {

    // we should throw outside or handled exception inside try block
    public FileInputStream read1() throws customException, IOException {
        FileInputStream stream = null;
        try {
            stream = new FileInputStream("E:\\Full Stack Development\\input.txt");
            int n;
            while ((n = stream.read()) != -1) {
                throw new customException();
            }
        } catch (customException e) {
            throw new customException();
        }

        return stream;
    }

}


