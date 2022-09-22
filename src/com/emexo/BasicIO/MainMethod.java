package com.emexo.BasicIO;

import java.io.IOException;

public class MainMethod {

    public static void main(String[] args) throws IOException {

        ByteReadWrite obj = new ByteReadWrite();
        obj.readAndWriteFile("E:\\Full Stack Development\\input.txt", "E:\\Full Stack Development\\output.txt");
    }
}
