package com.emexo.hashset;

import com.emexo.linkedlist.Account;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeId(1);
        emp.setEmployeeName("karthik");
        Employee emp1 = new Employee();
        emp1.setEmployeeId(2);
        emp1.setEmployeeName("sandhya");
        Employee emp2 = new Employee();
        emp2.setEmployeeId(3);
        emp2.setEmployeeName("manika");
        Employee emp3 = new Employee();
        emp3.setEmployeeId(3);
        emp3.setEmployeeName("manika");

        Set<Employee> sets = new HashSet<>();
        sets.add(emp);
        sets.add(emp1);
        sets.add(emp2);
        sets.add(emp3);

        System.out.println("The size of hash set: " + sets.size());

        EmployeeList obj = new EmployeeList();
       // obj.iterateUsingLambdaExpression(sets);
       // obj.iterateUsingForEach1(sets);
        obj.iterateUsingIterator(sets);


         }

    }


