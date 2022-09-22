package com.emexo.map1;

import java.util.*;

public class SortOnBasisOfValueMap {
        public static void sortStringMap(Map<String, String> map) {
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

        public static void sortEmployeeMap(LinkedHashMap<Employee, Integer> map) {
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
}
