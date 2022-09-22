package com.emexo.Set;

import java.util.HashSet;
import java.util.Set;

// Hash set
public class Main2 {

    public static void main(String[] args) {

        EmployeeExample1 employee1 = new EmployeeExample1();

        employee1.setEmployeeID(1);
        employee1.setEmployeename("Karthik");
        employee1.setAddress("perumbakkam");

        EmployeeExample1 employee2 = new EmployeeExample1();
        employee2.setEmployeeID(2);
        employee2.setEmployeename("Regu");
        employee2.setAddress("Medavakkam");

        EmployeeExample1 employee3 = new EmployeeExample1();
        employee3.setEmployeeID(1);
        employee3.setEmployeename("Karthik");
        employee3.setAddress("Bangalore");

        Set<EmployeeExample1> set = new HashSet<>();
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);

        System.out.println("The size of hash set: "+ set.size());

      //  for(EmployeeExample data:set){
      //      System.out.println(data);
      //  }

        set.forEach(e -> {
            System.out.println(e);
        });

    }
}
