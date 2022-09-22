package com.emexo.ConstructorExample;

public class Main {

    public static void main(String[] args) {
        // Tightly coupled constructor

        Employee emp = new Employee(1, "karthikeyan", true, 172l, 500000.0f, 10000, 20000l, false);
        emp.getEmployeeDetails();
    }
}
