package com.emexo.linkedhashset;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Iterator;
import java.util.Set;

public class StudentList {

    public void iterateUsingLambda(Set<Student> set){
        set.forEach(student -> System.out.println(student.getStudentId()+ ":" +student.getStudentGrade()));
        set.forEach(student -> System.out.println(student.getStudentId()+ ":" +student.getStudentName()));
    }

    public void iterateUsingForEach(Set<Student> set){
        if(CollectionUtils.isNotEmpty(set)){
            for(Student data: set){
                System.out.println(data.getStudentId()+ ":"+ data.getStudentName());
            }
        }
    }

    public void iterateUsingWhileLoop(Set<Student> set){
        if(CollectionUtils.isNotEmpty(set)){
            System.out.println("Forward direction");
            Iterator<Student> iterator = set.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }
    }
}
