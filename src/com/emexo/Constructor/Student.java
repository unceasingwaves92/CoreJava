package com.emexo.Constructor;

public class Student {

    // static variable
    public static final String NAME = "KARTHIKEYAN";

    // Instance variable
    public int empId;
//== c;lasdssfsd    // class name // reference variable name
    private Marks marks;

    public String empResult;

    // instance variable assigned to constructor
    // There is no return type, same constructor initialize all variable
    public Student(int id, String result, Marks marks) {

        this.empId = id;
        this.empResult = result;
        this.marks = marks;
    }


    // Static variable call inside static method
    public static void getStudentDetails1() {
        // classname.staticname
        System.out.println(Student.NAME);
    }

    // Print instance method
    public void Student() {

        System.out.println("EmpId: " + empId);
        System.out.println("EmpResult: " + empResult);
        marks.marksDetails();
    }


}
