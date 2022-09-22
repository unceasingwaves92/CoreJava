package com.emexo.Constructor;

public class Marks {

    // static variable
    public static final String NAME = "KARTHIKEYAN";

    // instance variable
    public int totalMarks;

    public String resultStatus;

    // instance variable assigned to constructor
    // There is no return type, same constructor initialize all variable
    public Marks(int score, String result) {

        this.totalMarks = score;
        this.resultStatus = result;
    }

    // Static variable call inside static method
    public static void getDetails() {
        System.out.println(Marks.NAME);
    }

    // Print instance method
    public void marksDetails() {

        System.out.println("TotalMarks: " + totalMarks);
        System.out.println("Status: " + resultStatus);

    }

}
