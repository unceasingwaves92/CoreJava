package com.emexo.list;

import java.util.Comparator;

public class CompareByName implements Comparator<Employee> {

      @Override
    public int compare(Employee emp1, Employee emp2) {

          // ascending order of employee name
      //  return emp1.getEmployeeName().compareTo(emp2.getEmployeeName());
          // descending order of employee name
       //   return emp2.getEmployeeName().compareTo(emp1.getEmployeeName());
          // ascending order of employee id
         // return emp1.getEmployeeId()-emp2.getEmployeeId();
        // descending order of employee id
          return emp2.getEmployeeId()-emp1.getEmployeeId();
    }
}
