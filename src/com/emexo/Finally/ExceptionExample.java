package com.emexo.Finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {

    public FileInputStream read1() throws IOException {
        FileInputStream stream = null;
        try {
            stream = new FileInputStream("E:\\Full Stack Development\\input1.txt");
            int n;
            while ((n=stream.read()) != -1) {
            }
        } catch (FileNotFoundException | ArithmeticException ex1) {
            ex1.printStackTrace();
        } finally {
            stream.close();
        }
        return stream;
    }
}
