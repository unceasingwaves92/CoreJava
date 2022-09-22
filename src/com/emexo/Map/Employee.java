package com.emexo.Map;

import com.emexo.Set.EmployeeExample1;

public class Employee implements Comparable<Employee> {

    private String name;
    private String address;

    private int mob;

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

    public int getMob() {
        return mob;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mob=" + mob +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
        return emp.getName().compareTo(this.getName());
    }
}


