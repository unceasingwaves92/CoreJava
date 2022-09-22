package com.emexo.Set;

import java.util.Set;
import java.util.TreeSet;

// Tree set
public class Main3 {

    public static void main(String[] args) {

        EmployeeExample employee1 = new EmployeeExample();

        employee1.setEmployeeID(1);
        employee1.setEmployeename("Karthik");
        employee1.setAddress("perumbakkam");

        EmployeeExample employee2 = new EmployeeExample();
        employee2.setEmployeeID(2);
        employee2.setEmployeename("Regu");
        employee2.setAddress("Medavakkam");

        EmployeeExample employee3 = new EmployeeExample();
        employee3.setEmployeeID(1);
        employee3.setEmployeename("Karthik");
        employee3.setAddress("Bangalore");

        Set<EmployeeExample> set = new TreeSet<>();
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);

        System.out.println("The size of tree set: "+ set.size());

        for(EmployeeExample data:set){
            System.out.println(data);
        }

      //  set.forEach(e -> {
         //   System.out.println(e);
       // });

    }
}
