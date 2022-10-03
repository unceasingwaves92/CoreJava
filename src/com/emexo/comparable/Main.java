package com.emexo.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentId(11);
        student1.setStudentName("karthik");
        student1.setEmail("karthik@gmail.com");
        student1.setMobNo(12345);

        Student student2 = new Student();
        student2.setStudentId(12);
        student2.setStudentName("divya");
        student2.setEmail("regu@gmail.com");
        student2.setMobNo(45321);

        Student student3 = new Student();
        student3.setStudentId(13);
        student3.setStudentName("sandhya");
        student3.setEmail("sandhya@gmail.com");
        student3.setMobNo(38945);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        Collections.sort(list);

        list.forEach(data ->{
                    System.out.println(data.getStudentId()+ ":" +data.getStudentName());
        }
                );
        /*for(Student data:list){
            System.out.println(data.getStudentId()+ ":" +data.getStudentName());
        }*/;;
    }

}
