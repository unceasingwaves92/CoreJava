package com.emexo.map1;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortingMainClass {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Manika");
        map.put("address", "Bangalore");
        map.put("lastname", "Raj");
        map.put("colour", "Red");
        SortOnBasisOfValueMap.sortStringMap(map);
        LinkedHashMap<Employee, Integer> employeeDateLinkedHashMap =OperationOnEmployee.addEmployee();
        SortOnBasisOfValueMap.sortEmployeeMap(employeeDateLinkedHashMap);

    }
}
