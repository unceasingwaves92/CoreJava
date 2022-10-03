package com.emexo.comparator;

import com.emexo.comparator.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        student2.setStudentName("deep");
        student2.setEmail("deep@gmail.com");
        student2.setMobNo(45321);

        Student student3 = new Student();
        student3.setStudentId(13);
        student3.setStudentName("ranjana");
        student3.setEmail("ranjana@gmail.com");
        student3.setMobNo(38945);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

     //   before java 8
     //   Collections.sort(list, new SortByEmail());

             // comparator from java 8 - ascending order
     //   list.sort(Comparator.comparing(s -> s.getEmail()));

            // ascending and descending order
     //   Collections.sort(list, (e1, e2) -> e2.getEmail().compareTo(e1.getEmail()));
     //   System.out.println("*************************************");
        Collections.sort(list, (n1, n2)-> n1.getStudentName().compareTo(n2.getStudentName()));

        list.forEach(data ->{
                    System.out.println(data.getStudentId()+ ":" +data.getStudentName());
                }
        );
    }
}
