package com.emexo.exceptionexample;

import com.emexo.CustomExample.customException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample3 {

    public FileInputStream read() throws CustomException, IOException{

        try(FileInputStream stream = new FileInputStream("E:\\Full Stack Development\\input1 .txt");){
            int n;
            while((n=stream.read())!=-1) {
                throw new CustomException();
            }
        }catch(CustomException e){
                throw new CustomException();
            }

        System.out.println("Rest of the code is executed");


        return null;
    }
}
