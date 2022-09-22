package com.emexo.Finally;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionExample1 {

    // Java 7 super resource its automatically closed JVM
    public void read() {
        try (FileInputStream stream = new FileInputStream("E:\\Full Stack Development\\input.txt");) { // try with resource java 7
             while (stream.read() != -1) {
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
