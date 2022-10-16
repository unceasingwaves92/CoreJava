package com.emexo.concurrhashmapsynchronizedmap;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainSychronziedExample {
    public static void main(String[] args) {
        SynchronizedMapExample map1 = new SynchronizedMapExample();
        map1.setStudentName("karthik");
        map1.setStudentRollNo(3);
        SynchronizedMapExample map2 = new SynchronizedMapExample();
        map2.setStudentName("regu");
        map2.setStudentRollNo(8);
        SynchronizedMapExample map3 = new SynchronizedMapExample();
        map3.setStudentName("sandhya");
        map3.setStudentRollNo(3);
        SynchronizedMapExample map4 = new SynchronizedMapExample();
        map4.setStudentName("divya");
        map4.setStudentRollNo(3);
        Map<SynchronizedMapExample, String> map = new HashMap<>();
        map.put(map1, "a");
        map.put(map2, "b");
        map.put(map3, "c");
        map.put(map4, "d");
        Collections.synchronizedMap(map);
        MainSychronziedExample obj = new MainSychronziedExample();
       // obj.iterateUsingLambdaExpression(map);
        obj.iterateUsingForEach(map);

    }
    public void iterateUsingLambdaExpression(Map<SynchronizedMapExample, String> map){
        map.forEach((k,v)-> System.out.println(k+ ":" +v));
    }

    public void iterateUsingForEach(Map<SynchronizedMapExample, String> map){
        if(CollectionUtils.isNotEmpty(map.keySet())){
            Set<Map.Entry<SynchronizedMapExample, String>> set = map.entrySet(); // convert to set
            for(Map.Entry<SynchronizedMapExample, String> data: set){
                System.out.println(data.getKey()+ ":" +data.getValue());
            }

        }
    }

}
