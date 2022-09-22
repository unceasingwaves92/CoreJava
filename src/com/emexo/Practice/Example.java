package com.emexo.Practice;

public class Example {

    // Static variable
    public static final String ORG_NAME = "EPAM";

    // Wrapper// Autoboxing
    public Integer input1;
    public Integer input2;

    // unboxing/convert wrapper class from main method to corresponding primitive data type
    public int input3;

    public int input4;

    public boolean empCompany;

    // Parameterized constructor
    public Example(Integer input1, Integer input2, int input3, int input4, boolean company) {
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.input4 = input4;
        this.empCompany = company;

    }

    public static String getOrgName() {

        String response = "This is static method";
        return response;
    }

    public static void getOrgNameDetails() {
        System.out.println(Example.ORG_NAME);
    }

    public void getInputBoxingWrapperDetails() {
        // Convert primitive data type to convert object format wrapper class
        // local variable within main method
        int output = input1 + input2;
        System.out.println("The autoboxing value is: " + output);
    }

    public void getInputUnBoxingWrapperDetails() {
        // Convert object format to convert corresponding primitive data type
        Integer output = input3 + input4;
        System.out.println("The unboxing value is: " + output);

    }

    public void getPrimitiveDataType() {
        System.out.println("The boolean value is: " + empCompany);
    }

    // if-condition
    public void conditionWithSingleIf(int age, int age1) {
        if (age > age1) {
            System.out.println("Valid age");
        }
    }

    public void conditionWithMultipleStatement(int age, int age1) {
        if (age > age1){
            System.out.println("Valid age");
        }
        else {
            System.out.println("Invalid age");
        }
    }

    // String literal

    public void StringLiter(){
        String str1 = "chennai";
        String str2 = "chennai";
        String str3 = new String("chennai");
        System.out.println("The string literal is: "+ str1);
        System.out.println("The string literal existing memory space is: "+ str2);
        System.out.println("The new operator is: "+ str3);
    }

    // String compare
    public boolean compareStringEquals(String str1, String str2) {
        if(str1 == str2){
            System.out.println("The equal value is: "+ true);
            return true;
        }
        else {
            System.out.println("The equal value is: "+ false);
            return false;
        }
    }

    public boolean compareStringEqualsMethod(String str1, String str2){
        if(str1.equalsIgnoreCase(str2)) {
            System.out.println("The compare equals is: "+ true);
            return true;
        }
        else {
            System.out.println("The compare not equals is: "+ false);
            return false;
        }
    }

    public boolean compareStringCompareTo(String str1, String str2) {
        if(str1.compareTo(str2)==0){
            System.out.println("The compareTo value is: "+ true);
            return true;
        }
        else {
            System.out.println("The compareTo value is: "+ false);
            return false;
        }
    }

    // String Builder
    public String getStringBuilder(String str1, String str2) {
        StringBuilder bui = new StringBuilder(str1);
        bui.append(str2);
        return bui.toString();
    }

    // String Buffer
    public String getStringBuffer(String str1, String str2) {
        StringBuffer buff = new StringBuffer(str1);
        buff.append(str2);
        return buff.toString();
    }

    // Switch case
    public String switchCaseDetails(String month) {
        String response;
        switch (month) {
            case "January":
                response = "January";
                break;
            case "Febuary":
                response = "Febuary";
                break;
            default:
                response = month;
                break;
        }
        return response;
    }
}