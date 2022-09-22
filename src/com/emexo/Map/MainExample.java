package com.emexo.Map;

import java.util.*;

public class MainExample {

    public static void main(String[] args) throws InterruptedException {

        EmployeeExample2 emp1 = new EmployeeExample2();

        emp1.setEmpID(11);
        emp1.setEmpAddress("Chennai");
        emp1.setEmpName("Karthik");

        EmployeeExample2 emp2 = new EmployeeExample2();
        emp2.setEmpID(12);
        emp2.setEmpAddress("Punjab");
        emp2.setEmpName("Kinjal");

        EmployeeExample2 emp3 = new EmployeeExample2();
        emp3.setEmpID(13);
        emp3.setEmpAddress("Bangalore");
        emp3.setEmpName("Sandhya");

        EmployeeExample2 emp4 = new EmployeeExample2();
        emp4.setEmpID(13);
        emp4.setEmpAddress("Bangalore");
        emp4.setEmpName("Regu");

        Map<EmployeeExample2, Integer> map = new HashMap<>();
        // TreeMap<String, String> map = new TreeMap<>();
        //   LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put(emp1, 3);
        map.put(emp2, 2);
        map.put(emp3, 1);
        Thread.sleep(5000);
        map.put(emp4, 1);

        Set<Map.Entry<EmployeeExample2, Integer>> set = map.entrySet();

        for(Map.Entry<EmployeeExample2, Integer> data:set){
            System.out.println(data.getKey() + " : " + data.getValue());
            System.out.println(data.getValue());
        }

      //  Collections.sort(map, (n1, n2) -> n1.g()-n2.getBalance());
     //   System.out.println(map.size());
       // System.out.println("Sort map by keys: " + sortByKey(map));
       // map.forEach((key, value)-> System.out.println(key + " : " + value));
       //map.forEach((key, value)-> System.out.println(map(key)));


    }


}


