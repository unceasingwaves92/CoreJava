package com.emexo.linkedhashmap;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentList {

    public void iterateUsingLambda(Map<Student, String> map){
        map.forEach((k,v)-> System.out.println(k+ ":" +v));
    }

    public void iterateUsingForEach(Map<Student, String> map){
        if(CollectionUtils.isNotEmpty(map.keySet())){
            Set<Map.Entry<Student, String>> set = map.entrySet();
            for(Map.Entry<Student, String> entry: set){
                System.out.println(entry.getKey()+ ":" +entry.getValue());
            }

        }
    }

    public void iterateUsingWhileLoop(Map<Student, String> map){
        if(CollectionUtils.isNotEmpty(map.keySet())){
            System.out.println("forward direction");
            Iterator<Student> iterator = map.keySet().iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }
    }
}
