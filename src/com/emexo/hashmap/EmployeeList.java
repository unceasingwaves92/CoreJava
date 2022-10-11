package com.emexo.hashmap;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmployeeList {

    public void iterateUsingLambda(Map<Employee, Integer> map){
        map.forEach((k, v) -> System.out.println(k+ ":" +v));
    }

    public void iterateUsingForEach(Map<Employee, Integer> map) {
        if (CollectionUtils.isNotEmpty(map.keySet())) {
            Set<Map.Entry<Employee, Integer>> set = map.entrySet();  // convert to set
            for (Map.Entry<Employee, Integer> entry : set) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }


    public void iterateUsingForWhileLoop(Map<Employee, Integer> map) {
        if (CollectionUtils.isNotEmpty(map.keySet())) {
            System.out.println("Forward direction");
            Iterator<Employee> iterate = map.keySet().iterator();
            while (iterate.hasNext()) {
                System.out.println(iterate.next());
            }
        }
    }
}
