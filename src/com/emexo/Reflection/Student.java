package com.emexo.Reflection;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int studentId;
    private String stuName;
    private int stuPh;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuPh() {
        return stuPh;
    }

    public void setStuPh(int stuPh) {
        this.stuPh = stuPh;
    }

    public List<String> getStudent(int input, String input1, int input2){
        List<String> list = null;
        try {
            list = new ArrayList<>();
            list.add(String.valueOf(input));
            list.add(input1);
            list.add(String.valueOf(input2));
            System.out.println(list);
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", stuName='" + stuName + '\'' +
                ", stuPh=" + stuPh +
                '}';
    }
}
