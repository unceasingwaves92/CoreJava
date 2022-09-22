package com.emexo.Stringcomparison;

public class StringCompare {


    public boolean compareStringUsingDoubleEquals(String str1, String str2) {

        if(str1 == str2){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean compareStringUsingEquals(String str1, String str2){
        if(str1.equals(str2)){
            return true;
        }
        else {
            return false;
        }

    }

    public boolean compareStringCaseEquals(String str1, String str2){
        if(str1.equalsIgnoreCase(str2)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean compareStringUsingCompareTo(String str1, String str2) {
        if(str1.compareTo(str2)==0){
           return true;
        }
        else {
            return false;
        }
   }

   public boolean compareStringCaseCompareTo(String str1, String str2){
        if(str1.compareToIgnoreCase(str2)==0){
            return true;
        }
        else {
            return false;
        }
   }



}
