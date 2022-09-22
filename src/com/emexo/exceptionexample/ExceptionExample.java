package com.emexo.exceptionexample;

public class ExceptionExample {

    public void exception(String input){

        try {
            System.out.println(input.toUpperCase());
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("final statement always executed");
        }
    }



}
