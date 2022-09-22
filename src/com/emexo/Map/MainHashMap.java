package com.emexo.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// hash map
public class MainHashMap {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("Manicka");
        emp1.setAddress("Bangalore");
        emp1.setMob(123567890);

        Employee emp2 = new Employee();
        emp2.setName("Sandhya");
        emp2.setAddress("Bangalore");
        emp2.setMob(123333333);

        Employee emp3 = new Employee();
        emp3.setName("Karthik");
        emp3.setAddress("Chennai");
        emp3.setMob(123456789);

        Map<String, String> map = new HashMap<>();
        map.put("name", "kinjal");
        map.put("address", "punjab");
        map.put("mob", "9962166699");
        map.put("name", "karthik");
        map.put("address", "chennai");
        map.put("mob", "8765432212");


        System.out.println(map.size());

        String name = map.get("name");
        System.out.println(name);

        Set<Map.Entry<String, String>> set = map.entrySet();

        for(Map.Entry<String, String> data:set){
            System.out.println(data.getKey() + " : " + data.getValue());
        }

        map.forEach((key, value)-> System.out.println(key + " : " + value));



    }
}
