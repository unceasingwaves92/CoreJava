package com.emexo.Set;

import java.util.LinkedHashSet;
import java.util.Set;

// linked hash set
public class MainLinked {

    public static void main(String[] args) {

        EmployeeExample2 employee1 = new EmployeeExample2();

        employee1.setEmployeeID(1);
        employee1.setEmployeename("Karthik");
        employee1.setAddress("perumbakkam");

        EmployeeExample2 employee2 = new EmployeeExample2();
        employee2.setEmployeeID(2);
        employee2.setEmployeename("Regu");
        employee2.setAddress("Medavakkam");

        EmployeeExample2 employee3 = new EmployeeExample2();
        employee3.setEmployeeID(1);
        employee3.setEmployeename("Karthik");
        employee3.setAddress("Bangalore");

        Set<EmployeeExample2> set = new LinkedHashSet<>();
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);

        System.out.println("The size of Linked hashset: "+ set.size());

        for(EmployeeExample2 data:set){
            System.out.println(data);
        }

        //  set.forEach(e -> {
        //   System.out.println(e);
        // });

    }
}


