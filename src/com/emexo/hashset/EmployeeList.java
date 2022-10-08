package com.emexo.hashset;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EmployeeList extends Employee {

    // iterate for lambda expression
    public void iterateUsingLambdaExpression(Set<Employee> sets) {

        sets.forEach(acc -> System.out.println(acc.getEmployeeId() + ":" + acc.getEmployeeName()));
    }

    // iterate for each loop
    public void iterateUsingForEach(Set<Employee> sets) {
        if (CollectionUtils.isNotEmpty(sets)) {
            for (Employee employee : sets) {
                System.out.println(employee.getEmployeeId() + ":" + employee.getEmployeeName());
            }
        }
    }

    // iterate for while loop
    public void iterateUsingIterator(Set<Employee> sets) {
        if (CollectionUtils.isNotEmpty(sets)) {
            Iterator<Employee> iterator = sets.iterator();
            System.out.println("Forward direction");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
