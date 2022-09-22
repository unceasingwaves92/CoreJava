package com.emexo.Map;

import sun.awt.image.ImageWatched;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MainLinkedHM {

    public static void main(String[] args) {

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("name", "aarthi");
        map.put("address", "punjab");
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
