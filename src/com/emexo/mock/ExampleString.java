package com.emexo.mock;

public class ExampleString {


    public String getStringBuilder(String str1){

        StringBuilder builder = new StringBuilder(str1);
        builder.reverse();
        return builder.toString();

    }
}
