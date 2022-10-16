package com.emexo.concurcolleccopyonArrayListsynchronized;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSynchronizedList implements Comparable<ArrayListSynchronizedList>{

    private int studentID;
    private String studentName;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "ArrayListSynchronizedList{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    @Override
    public int compareTo(ArrayListSynchronizedList account) {
        return this.getStudentName().compareTo(account.studentName);
    }
}
