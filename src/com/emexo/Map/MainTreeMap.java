package com.emexo.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainTreeMap {

    public static void main(String[] args) {

        Employee emp = new Employee();
        TreeMap<String, String> map = new TreeMap<>();
        map.put("address", "punjab");
        map.put("address", "chennai");
        map.put("mob", "9962166699");
        map.put("name", "karthik");
        // map.put("address", "chennai");
        //  map.put("mob", "8765432212");


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


