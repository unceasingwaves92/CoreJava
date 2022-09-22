package com.emexo.String;

import java.util.Locale;

public class StringLiteral {




    public static void main(String[] args) {

        // Create a string by string literal
        String str = "bangalore";
        String str1 = "bangalore";
        String str2 = "bangalore";
        // local variable invoke main method/but it makes new changes it will produce new string
        String upper = str2.toUpperCase();
        // Create a new string/It create the space inside the heap area
        String str3 = new String("bangalore");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(upper);
        System.out.println(str3);
    }
}
