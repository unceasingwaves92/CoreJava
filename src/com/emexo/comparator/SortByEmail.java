package com.emexo.comparator;

import java.util.Comparator;

public class SortByEmail implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // descending order
      //  return student2.getEmail().compareTo(student1.getEmail());
        // ascending order
        return student1.getEmail().compareTo(student1.getEmail());
    }
}
