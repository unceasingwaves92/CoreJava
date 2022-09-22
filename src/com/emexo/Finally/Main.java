package com.emexo.Finally;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ExceptionExample example = new ExceptionExample();
        example.read1();
        System.out.println(example.read1());
    }
}
