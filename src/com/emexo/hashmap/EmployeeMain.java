package com.emexo.hashmap;

import com.emexo.Map.EmployeeExample1;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmpID(1);
        emp1.setEmpEmail("karthik@gmail.com");

        Employee emp2 = new Employee();
        emp2.setEmpID(2);
        emp2.setEmpEmail("regu@gmail.com");

        Employee emp3 = new Employee();
        emp3.setEmpID(3);
        emp3.setEmpEmail("manika@gmail.com");

        Employee emp4 = new Employee();
        emp4.setEmpID(1);
        emp4.setEmpEmail("karthik@gmail.com");

        Map<Employee, Integer> map = new HashMap<>();
        map.put(emp1, 3);
        map.put(emp2, 2);
        map.put(emp3, 1);
        map.put(emp4, 0);
        map.put(null, 99000990);

        EmployeeList obj = new EmployeeList();
       // obj.iterateUsingLambda(map);
          obj.iterateUsingForEach(map);
        //  obj.iterateUsingForWhileLoop(map);


    }


    }

