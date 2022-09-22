package com.emexo.Stringcomparison;

public class main {
    public static void main(String[] args) {
        StringCompare str = new StringCompare();

        String str1 = "Hello";
        String str2 = new String("Hi");
        String str3 = new String("Hello");
        boolean res = str.compareStringUsingDoubleEquals(str1, str2);
        boolean res1 = str.compareStringUsingEquals(str1, str2);
        boolean res2 = str.compareStringUsingCompareTo(str1, str3);
        boolean res3 = str.compareStringCaseEquals(str1, str2);
        boolean res4 = str.compareStringCaseCompareTo(str1, str2);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);

    }
}
