package com.emexo.BasicIO;

import com.emexo.exceptionexample.CustomException;

import java.io.*;

public class CopyBytes {

    public FileInputStream read() throws Exception {

        try (FileInputStream in =new FileInputStream("E:\\Full Stack Development\\input.txt") ;
        FileOutputStream out= new FileOutputStream("E:\\Full Stack Development\\output.txt")){
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }

        System.out.println("Byte stream converted to output stream");
        return null;
    }

}
