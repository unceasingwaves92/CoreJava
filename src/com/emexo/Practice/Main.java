package com.emexo.Practice;

public class Main {

    public static void main(String[] args) {

        Example ex = new Example(10, 10, 20, 20, true);
        ex.getInputBoxingWrapperDetails();
        ex.getInputUnBoxingWrapperDetails();
        String out = Example.getOrgName();
        System.out.println("The organization name is: "+ out);
        Example.getOrgNameDetails();
        ex.getOrgNameDetails();
        ex.conditionWithSingleIf(10, 5);
        ex.conditionWithMultipleStatement(5,10);
        ex.StringLiter();
        ex.compareStringEquals("karthik", "Karthik");
        ex.compareStringEqualsMethod("karthik", "Karthik");
        ex.compareStringCompareTo("hi", "hi");
        System.out.println("The value of StringBuilder is: "+ ex.getStringBuilder("Karthik", "Kalyanachidambaram"));
        System.out.println("The value of StringBuffer is: "+ ex.getStringBuffer("Malliga", "Palani"));
        System.out.println("The value of month is: "+ex.switchCaseDetails("January"));

    }
}
