package com.emexo.Constructor;

public class Main {

    public static void main(String[] args) {
        Marks mar = new Marks(90, "Pass");
        // loosely coupled constructor
        Student stu = new Student(1, "destination", mar);

        stu.Student();

    }
}
