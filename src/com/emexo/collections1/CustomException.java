package com.emexo.collections1;

public class CustomException extends Exception{

    public CustomException(){
        super();
    }

    public CustomException(String msg){
        super(msg);
    }

    public CustomException(Throwable t, String msg){
        super(msg, t);
    }
}
