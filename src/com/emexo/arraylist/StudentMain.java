package com.emexo.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

    public static void main(String[] args) {
        StudentList studentList1 = new StudentList();
        studentList1.setName("Deepesh");
        StudentList studentList2 = new StudentList();
        studentList2.setName("RAM");
        List<StudentList> list = new ArrayList<>();
        list.add(studentList1);
        list.add(studentList2);



        list.forEach(a-> System.out.println(" Student Name "+a.getName()));

    }
}
