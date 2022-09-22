package com.emexo.map1;


import java.util.Date;
import java.util.LinkedHashMap;

public class OperationOnEmployee {

    public static LinkedHashMap addEmployee() {
        LinkedHashMap<Employee, Integer> employeeDateTreeMap = new LinkedHashMap<>();
        Employee emp1 = new Employee();
        emp1.setEmployeeID(1002);
        emp1.setEmployeeName("Manika Raj");
        emp1.setEmployeeDesignation("Developer");
        employeeDateTreeMap.put(emp1,8);


        Employee emp2 = new Employee();
        emp2.setEmployeeID(2001);
        emp2.setEmployeeName("Santosh Swaraj");
        emp2.setEmployeeDesignation("Content Writer");
        employeeDateTreeMap.put(emp2, 10);



        Employee emp3 = new Employee();
        emp3.setEmployeeID(1001);
        emp3.setEmployeeName("Santosh Kumar");
        emp3.setEmployeeDesignation("Tester");
        employeeDateTreeMap.put(emp3, 5);



        return employeeDateTreeMap;
    }

    public static void getAllEmployees(LinkedHashMap<Employee, Integer> employeeDateTreeMap) {
        employeeDateTreeMap.forEach(
                (key, value) -> System.out.println("Key ID : " + key.getEmployeeID() + " value : " + value)
        );
    }
}
