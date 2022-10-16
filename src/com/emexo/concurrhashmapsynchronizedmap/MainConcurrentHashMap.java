package com.emexo.concurrhashmapsynchronizedmap;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MainConcurrentHashMap {

    public static void main(String[] args) {
        ConcurrentHashMapExample emp1 = new ConcurrentHashMapExample();
        emp1.setEmpId(1);
        emp1.setEmpName("regu");

        ConcurrentHashMapExample emp2 = new ConcurrentHashMapExample();
        emp2.setEmpId(2);
        emp2.setEmpName("karthik");

        ConcurrentHashMapExample emp3 = new ConcurrentHashMapExample();
        emp3.setEmpId(1);
        emp3.setEmpName("dhivya");

        ConcurrentHashMap<ConcurrentHashMapExample, Integer> map = new ConcurrentHashMap<>();
        map.put(emp1, 4);
        map.put(emp2, 1);
        map.put(emp3, 1);

        MainConcurrentHashMap obj = new MainConcurrentHashMap();
        // obj.iterateUsingWhileLoop(map);
        //   obj.iterateUsingLambda(map);
           obj.iterateUsingForEach(map);
    }

       public void iterateUsingLambda(ConcurrentHashMap<ConcurrentHashMapExample, Integer> map){
        map.forEach((k,v)-> System.out.println(k+ ":" +v));
       }

       public void iterateUsingWhileLoop(ConcurrentHashMap<ConcurrentHashMapExample, Integer> map){
           if(CollectionUtils.isNotEmpty(map.keySet()))
           System.out.println("forward direction");
           Iterator<ConcurrentHashMapExample> iterate = map.keySet().iterator();
           while(iterate.hasNext()){
               System.out.println(iterate.next());
           }
       }

       public void iterateUsingForEach(ConcurrentHashMap<ConcurrentHashMapExample, Integer> map){
        if(CollectionUtils.isNotEmpty(map.keySet())){
            Set<Map.Entry<ConcurrentHashMapExample, Integer>> set = map.entrySet();
            for(Map.Entry<ConcurrentHashMapExample, Integer> data: set){
                System.out.println(data.getKey()+ ":" +data.getValue());
            }
        }
       }
}
