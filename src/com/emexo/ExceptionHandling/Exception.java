package com.emexo.ExceptionHandling;

// Whenever create class no create predefined class
public class Exception extends Throwable {

    public void String(String input){

        try {
            System.out.println("The input is: " + input.toUpperCase());
        } catch(java.lang.Exception ex){
            ex.printStackTrace();
        }

    }
}
