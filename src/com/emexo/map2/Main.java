package com.emexo.map2;

import com.emexo.map2.Employee;
import com.emexo.map2.OperationOnEmployee;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

       Map<String, String> map = new HashMap<>();
        map.put("name", "Karthik");
        map.put("address", "Bangalore");
        map.put("lastname", "Chidambaram");
        map.put("colour", "Orange");
        // sort by value
        com.emexo.map2.OperationOnEmployee.sortStringMap1(map);
        System.out.println("sort by key");
        com.emexo.map2.OperationOnEmployee.sortStringMap2(map);
        System.out.println("******************");
        LinkedHashMap<Employee, Integer> employeeDateLinkedHashMap = new LinkedHashMap<>();
        Employee emp1 = new Employee();
        emp1.setEmployeeID(1002);
        emp1.setEmployeeName("Karthikeyan");
        emp1.setEmployeeDesignation("Developer");
        employeeDateLinkedHashMap.put(emp1,8);

        Employee emp2 = new Employee();
        emp2.setEmployeeID(2001);
        emp2.setEmployeeName("Regu");
        emp2.setEmployeeDesignation("Senior Developer");
        employeeDateLinkedHashMap.put(emp2, 10);

        Employee emp3 = new Employee();
        emp3.setEmployeeID(2001);
        emp3.setEmployeeName("Kinjal");
        emp3.setEmployeeDesignation("Unit Tester");
        employeeDateLinkedHashMap.put(emp3, 5);
        com.emexo.map2.OperationOnEmployee.sortEmployeeMap1(employeeDateLinkedHashMap);
        System.out.println("sort by key");
        com.emexo.map2.OperationOnEmployee.sortEmployeeMap2(employeeDateLinkedHashMap);
    }


}






