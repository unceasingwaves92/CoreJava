package com.emexo.Map;

import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        EmployeeExample1 emp1 = new EmployeeExample1();

        emp1.setEmpID(11);
        emp1.setEmpAddress("Chennai");
        emp1.setEmpName("Karthik");

        EmployeeExample1 emp2 = new EmployeeExample1();
        emp2.setEmpID(12);
        emp2.setEmpAddress("Punjab");
        emp2.setEmpName("Kinjal");

        EmployeeExample1 emp3 = new EmployeeExample1();
        emp3.setEmpID(13);
        emp3.setEmpAddress("Bangalore");
        emp3.setEmpName("Sandhya");

        EmployeeExample1 emp4 = new EmployeeExample1();
        emp4.setEmpID(13);
        emp4.setEmpAddress("Bangalore");
        emp4.setEmpName("Regu");

        Map<EmployeeExample1, Date> map = new HashMap<>();
       // TreeMap<String, String> map = new TreeMap<>();
     //   LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put(emp1, new Date());
        map.put(emp2, new Date());
        map.put(emp3, new Date());
        Thread.sleep(5000);
        map.put(emp4, new Date());

        System.out.println(map.size());

        map.forEach((key, value)-> System.out.println(key + " : " + value));


    }
}
