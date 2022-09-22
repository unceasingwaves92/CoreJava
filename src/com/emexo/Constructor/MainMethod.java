package com.emexo.Constructor;

public class MainMethod {
    public static void main(String[] args) {
        // Tightly coupled constructor
        Employee1 employee = new Employee1(4011, "Java Developer", 5, "Bangalore");
        employee.getEmployeeDetails();
    }



}
