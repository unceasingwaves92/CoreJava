package com.emexo.Constructor;

public class Employee {

    public int empId;
    public String empName;

    public Employee(){

        System.out.println("Default constructor");
        this.empId = 1;
        this.empName = "karthik";
    }

    public Employee(int id, String name)
    {
        System.out.println("Parameterized constructor");
        this.empId = id;
        this.empName = name;
    }

    public Employee(String name, int id){

        System.out.println("Parameterized constructor");
        this.empName = name;
        this.empId = id;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.empId + ":" + emp.empName);

        Employee emp1 = new Employee(1, "karthik");
        System.out.println(emp1.empId + ":" + emp1.empName);

        Employee emp2 = new Employee("Karthik", 2);
        System.out.println(emp2.empId + ":" + emp2.empName);



    }
}
