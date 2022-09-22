package com.emexo.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Array list
public class TestMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setEmployeeId(1);
        employee1.setEmployeeName("Karthik");
        employee1.setAddress("perumbakkam");

        Employee employee2 = new Employee();
        employee2.setEmployeeId(2);
        employee2.setEmployeeName("Regu");
        employee2.setAddress("Medavakkam");

        Employee employee3 = new Employee();
        employee3.setEmployeeId(3);
        employee3.setEmployeeName("Manicka");
        employee3.setAddress("Bangalore");

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
      //  System.out.println(list.get(employee1.getEmployeeId()));
      //  System.out.println(employee1);
        //System.out.println(list);

    //    Collections.sort(list);

      //  before Java 1.8
     //   Collections.sort(list, new CompareByName());

        // Java 1.8
        // sort employee id ascending order
      //  list.sort(Comparator.comparing(e -> e.getEmployeeId()));
        // sort employee name ascending order
      //  list.sort(Comparator.comparing(e-> e.getEmployeeName()));

        // sort employee name descending order
       // Collections.sort(list, (n1, n2) -> n2.getEmployeeName().compareTo(n1.getEmployeeName()));

        // sort employee name ascending order
        Collections.sort(list, (n1, n2) -> n1.getEmployeeName().compareTo(n2.getEmployeeName()));

      //  System.out.println(employee1.getEmployeeId() + employee1.getEmployeeName() + employee1.getAddress());


        // concatenation dont double quotes with "+"
        list.forEach(emp-> System.out.println("Employee ID: " + emp.getEmployeeId() + " " + "Employee Name: "+ emp.getEmployeeName() +" " +" Employee Address: "+ emp.getAddress()));


    }
}
