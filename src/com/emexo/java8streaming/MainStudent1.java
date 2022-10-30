package com.emexo.java8streaming;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainStudent1 {

    public static void main(String[] args) {

        // create test data
      /*  List<String> students = new ArrayList<String>();

        // add values to list
        students.add("Roger");
        students.add("Rafael");
        students.add("Djokovic");
        students.add("Roger");
        students.add("Murray");
        students.add("Rafael");


        // pretty print
        System.out.println("1. Original list with duplicate values :\n");
        students.forEach(student -> System.out.println(student));

        // Java 8 - distinct() method
        List<String> uniqueList = students
                .stream() // get stream for original list
                .distinct() // distinct method removes duplicates
                .collect(Collectors.toList()); // distinct elements stored to new list

        // pretty print
        System.out.println("\n2. New list with unique values"
                + " maintaining original insertion order:\n");
        uniqueList.forEach(uniqueStudent -> System.out.println(uniqueStudent));*/
        Student1 name1 = new Student1();
        name1.setStuName("karthik");
        Student1 name2 = new Student1();
        name2.setStuName("regu");
        Student1 name3 = new Student1();
        name3.setStuName("karthik");
        Student1 name4 = new Student1();
        name4.setStuName("manika");

        Set<Student1> set = new LinkedHashSet<>();
        set.add(name1);
        set.add(name2);
        set.add(name3);
        set.add(name4);

        List<Student1> uniqueList = set
                .stream() // get stream for original list
                .distinct() // distinct method removes duplicates
                .collect(Collectors.toList()); // distinct elements stored to new list

        // pretty print
        System.out.println("\n2. New list with unique values"
                + " maintaining original insertion order:\n");
        uniqueList.forEach(uniqueStudent -> System.out.println(uniqueStudent));

    }
}
