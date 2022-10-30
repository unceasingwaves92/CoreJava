package com.emexo.java8streaming;

public class Student1 implements Comparable<Student1> {

    private String stuName;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "stuName='" + stuName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student1 stu) {
        return this.getStuName().compareTo(stu.getStuName());

    }
}