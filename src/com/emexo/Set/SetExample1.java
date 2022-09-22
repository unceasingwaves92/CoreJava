package com.emexo.Set;

import java.util.HashSet;
import java.util.Set;

// hash set
public class SetExample1 {

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

        Set<Employee> set = new HashSet<>();
        set.add(employee1);
        set.add(employee1);
        set.add(employee2);

        for(Employee data:set){
            System.out.println(data);
        }

      // set.forEach(data->System.out.println(data));
    }
}
