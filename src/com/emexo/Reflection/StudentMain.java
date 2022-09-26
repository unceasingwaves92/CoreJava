package com.emexo.Reflection;

import java.lang.reflect.Field;
import java.util.LinkedList;

public class StudentMain {

    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();
        Student student = new Student();
        try {
            student.setStudentId(1);
            student.setStuName("karthik");
            student.setStuPh(123);
            studentList.add(student);

            Class cls = student.getClass();
            Field field = cls.getDeclaredField("student");
            field.setAccessible(true);
            field.set(student, 1);
            System.out.println(field.get(student));
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
