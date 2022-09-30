package com.emexo.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;

public class StudentMain {

    public static void main(String[] args) {
       // LinkedList<Student> studentList = new LinkedList<>();
        Student stu = new Student();
        try {
            stu.setStudentId(1);
            stu.setStuName("karthik");
            stu.setStuPh(123);

           // stu.add(student);

            Class cls = stu.getClass();
            Field field = cls.getDeclaredField("studentId");
            field.setAccessible(true);
            field.set(stu, 1);
            System.out.println(field.get(stu));

            System.out.println("**************************");
            // access private method
            Method method = cls.getDeclaredMethod("getStudent", int.class, String.class, int.class);
         //   method.setAccessible(true);
            method.invoke(stu, 1, "karthik", 123);

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
