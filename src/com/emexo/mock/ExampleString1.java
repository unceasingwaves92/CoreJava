package com.emexo.mock;

//import static com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil.substring;

public class ExampleString1 {

    public String exampleString1(String input){

        String str = input;
        System.out.println(str.substring(0,1).toUpperCase()+ str.substring(1));
        return str;
    }


}
