package com.emexo.Stringcomparison;

public class StringRef {

    public static void main(String[] args) {

        String str1 = new String("Ram");
        String str2 = new String("Karthik");
        String str3 = new String("Janani");
        String str4 = new String("Ashok");

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str4));
        System.out.println(str4.compareTo(str2));
    }
}
