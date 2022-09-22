package com.emexo.exceptionexample;

public class CustomException extends Exception{

    // default constructor
    public CustomException(){
        super();
    }

    // parameterized constructor
    public CustomException(String msg){
        super(msg);
    }

    public CustomException(Throwable t, String msg){
        super(msg, t);
    }
}
