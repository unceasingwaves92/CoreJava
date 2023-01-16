package com.emexo.java8streaming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MainStreaming {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("Karthik");
        stu1.setScore(80);
        Student stu2 = new Student();
        stu2.setName("Regu");
        stu2.setScore(90);
        Student stu3 = new Student();
        stu3.setName("Sandhya");
        stu3.setScore(95);
        Student stu4 = new Student();
        stu4.setName("gayathri");
        stu4.setScore(60);
        Student stu5 = new Student();
        stu5.setName("Karthik");
        stu5.setScore(70);

        List<Student> listStudents = new ArrayList<>();
        listStudents.add(stu1);
        listStudents.add(stu2);
        listStudents.add(stu3);
        listStudents.add(stu4);
        listStudents.add(stu5);

        List<Student> listGoodStudents = listStudents.stream()
                .filter(s -> s.getScore() > 70)
                .sorted()
                .collect(Collectors.toList());
     //   Collections.sort(listGoodStudents);
        listGoodStudents.stream().forEach(System.out::println);

        // Calculate average score of all students
       /* double sum = 0.0;
        for(Student student: listGoodStudents){
            sum = sum + student.getScore();
        }
        double average = sum / listGoodStudents.size();
        System.out.println("Average score: "+ average);*/

        OptionalDouble average = listStudents.stream().mapToInt(stu-> stu.getScore()).average();
        if(average.isPresent()){
            System.out.println(average.getAsDouble());
        }
       /*// Collections.sort(listStudents);
        List<Student> duplicateNames = listStudents.stream()
                //.filter(stu->stu.getName())
                .sorted()
                .distinct()
             //   .sorted()
               // .map(stu-> stu.getName().toUpperCase())
                .map(stu-> stu.getName())
                .collect(Collectors.toList());
             //   .forEach(stu-> System.out.println(stu));*/

//         duplicateNames.forEach(data -> System.out.println(data));
//         System.out.println("******************");

         List<Student> top4Students = listStudents.stream()
                .filter(s->s.getScore() > 60)
                .sorted()
                .parallel()
                .limit(4)
                // .map(s->s.getScore())
                 .collect(Collectors.toList());



        top4Students.forEach(data -> System.out.println(data));

        System.out.println("*******************");

        List<Student> top3Students = listStudents.parallelStream()
                .filter(s->s.getScore()> 70)
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        top3Students.forEach(data -> System.out.println(data));


    }
}
