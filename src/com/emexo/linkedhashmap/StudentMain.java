package com.emexo.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentMain {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setStudentId(5);
        stu1.setStudentName("karthik");

        Student stu2 = new Student();
        stu2.setStudentId(2);
        stu2.setStudentName("manika");

        Student stu3 = new Student();
        stu3.setStudentId(1);
        stu3.setStudentName("Ranjana");

        Student stu4 = new Student();
        stu4.setStudentId(1);
        stu4.setStudentName("Sandhya");

        Map<Student, String> map = new LinkedHashMap<>();
        map.put(stu1, "a");
        map.put(stu2, "b");
        map.put(stu3, "c");
        map.put(stu4, "d");
        map.put(null, "abc");

        StudentList obj = new StudentList();
        obj.iterateUsingLambda(map);
    }
}
