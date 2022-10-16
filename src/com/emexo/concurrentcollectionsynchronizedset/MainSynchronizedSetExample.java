package com.emexo.concurrentcollectionsynchronizedset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MainSynchronizedSetExample {

    public static void main(String[] args) {
        SynchronizedSetExample emp1 = new SynchronizedSetExample();
        emp1.setEmpId(1);
        emp1.setEmpName("karthik");
        SynchronizedSetExample emp2 = new SynchronizedSetExample();
        emp2.setEmpId(1);
        emp2.setEmpName("manika");
        SynchronizedSetExample emp3 = new SynchronizedSetExample();
        emp3.setEmpId(1);
        emp3.setEmpName("manika");
        Set<SynchronizedSetExample> set = new HashSet<>();
        set.add(emp1);
        set.add(emp2);
        set.add(emp3);
        Collections.synchronizedSet(set);
        MainSynchronizedSetExample obj = new MainSynchronizedSetExample();
        obj.iterateUsingLambda(set);

    }

    public void iterateUsingLambda(Set<SynchronizedSetExample> set){
        set.forEach(data-> System.out.println(data.getEmpId()+ ":" +data.getEmpName()));
    }
}
