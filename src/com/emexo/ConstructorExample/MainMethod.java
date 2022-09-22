package com.emexo.ConstructorExample;

import com.emexo.Constructor.Employee1;

public class MainMethod {

    public static void main(String[] args) {
        // Loosely coupled

        Salary sal = new Salary(500000.0, 5000, 20000l, true);

        Organization emp = new Organization(1, "karthikeyan", true, 172l, sal);
        emp.getOrgDetails();
    }
}
