package com.emexo.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int id;
    private String name;
    private String address;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)  {
        if(age < 18 || age > 50){

            throw new IllegalArgumentException();

            //System.out.println("correct age: "+ age);
        }

        this.age = age;
    }




}
