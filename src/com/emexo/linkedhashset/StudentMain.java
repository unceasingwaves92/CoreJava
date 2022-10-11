package com.emexo.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentMain {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setStudentId(1);
        stu1.setStudentName("Sandhya");
        stu1.setStudentGrade("Cloud Master");

        Student stu2 = new Student();
        stu2.setStudentId(2);
        stu2.setStudentName("Ranjana");
        stu2.setStudentGrade("Java Architect");

        Student stu3 = new Student();
        stu3.setStudentId(2);
        stu3.setStudentName("Karthik");
        stu3.setStudentGrade("AI Engineer");

        Set<Student> set = new LinkedHashSet<>();
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);

        StudentList obj = new StudentList();
      //  obj.iterateUsingLambda(set);
          obj.iterateUsingForEach(set);

    }

}
