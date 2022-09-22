package com.emexo.map2;

import java.util.*;

public class OperationOnEmployee {

    /*public static LinkedHashMap getEmployee() {

        LinkedHashMap<Employee, Integer> obj = new LinkedHashMap<>();
        Employee emp1 = new Employee();
        emp1.setEmployeeID(1002);
        emp1.setEmployeeName("Karthikeyan");
        emp1.setEmployeeDesignation("Developer");
        obj.put(emp1,8);


        Employee emp2 = new Employee();
        emp2.setEmployeeID(2001);
        emp2.setEmployeeName("Regu");
        emp2.setEmployeeDesignation("Senior Developer");
        obj.put(emp2, 10);



        Employee emp3 = new Employee();
        emp3.setEmployeeID(1001);
        emp3.setEmployeeName("Kinjal");
        emp3.setEmployeeDesignation("Unit Tester");
        obj.put(emp3, 5);



        return obj;
    }*/

    public static void getAllDetails(LinkedHashMap<Employee, Integer> obj) {
        obj.forEach(
                (key, value) -> System.out.println("Key ID : " + key.getEmployeeID() + " value : " + value)
        );

    }

    // sort by value
    public static void sortEmployeeMap1(LinkedHashMap<Employee, Integer> map) {
        List<Map.Entry<Employee, Integer>> list;
        list = new LinkedList<Map.Entry<Employee, Integer>>(map.entrySet());
        map.forEach(
                (key, value) -> System.out.println("Key ID : " + key.getEmployeeID() + " value : " + value)
        );
        Collections.sort(list, (list1, list2) -> list1.getValue().compareTo(list2.getValue()));
        Map<Employee, Integer> linkedMap = new LinkedHashMap<>();
        for (Map.Entry<Employee, Integer> ls : list) {
            linkedMap.put(ls.getKey(), ls.getValue());
        }
        System.out.println("=====After Sort=====");
        linkedMap.forEach(
                (key, value) -> System.out.println("Key ID : " + key.getEmployeeID()+ " value : " + value)
        );
    }

    // sort by key
    public static void sortEmployeeMap2(LinkedHashMap<Employee, Integer> map) {
        List<Map.Entry<Employee, Integer>> list;
        list = new LinkedList<Map.Entry<Employee, Integer>>(map.entrySet());
        map.forEach(
                (key, value) -> System.out.println("Key ID : " + key.getEmployeeID() + " value : " + value)
        );
       // Collections.sort(list, (list1, list2) -> list1.getKey().compareTo(list2.getKey()));
        Map<Employee, Integer> linkedMap = new HashMap<>();
        for (Map.Entry<Employee, Integer> ls : list) {
            linkedMap.put(ls.getKey(), ls.getValue());
        }
        System.out.println("=====After Sort=====");
        linkedMap.forEach(
                (key, value) -> System.out.println("Key ID : " + key.getEmployeeID()+ " value : " + value)
        );
    }

    // sort by value
    public static void sortStringMap1(Map<String, String> map) {
        List<Map.Entry<String, String>> list;
        list = new LinkedList<Map.Entry<String, String>>(map.entrySet());
        map.forEach(
                (key, value) -> System.out.println("Key ID : " + key + " value : " + value)
        );
        Collections.sort(list, (list1, list2) -> list1.getValue().compareTo(list2.getValue()));
        Map<String, String> linkedMap = new LinkedHashMap<>();
        for (Map.Entry<String, String> ls : list) {
            linkedMap.put(ls.getKey(), ls.getValue());
        }
        System.out.println("=====After Sort=====");
        linkedMap.forEach(
                (key, value) -> System.out.println("Key ID : " + key + " value : " + value)
        );
    }

    // sort by key
    public static void sortStringMap2(Map<String, String> map) {
        List<Map.Entry<String, String>> list;
        list = new LinkedList<Map.Entry<String, String>>(map.entrySet());
        map.forEach(
                (key, value) -> System.out.println("Key ID : " + key + " value : " + value)
        );
        Collections.sort(list, (list1, list2) -> list1.getKey().compareTo(list2.getKey()));
        Map<String, String> linkedMap = new HashMap<>();
        for (Map.Entry<String, String> ls : list) {
            linkedMap.put(ls.getKey(), ls.getValue());
        }
        System.out.println("=====After Sort=====");
        linkedMap.forEach(
                (key, value) -> System.out.println("Key ID : " + key + " value : " + value)
        );
    }


}
