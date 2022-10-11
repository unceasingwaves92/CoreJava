package com.emexo.treemap;

import com.emexo.linkedhashmap.Student;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

public class TransactionList {

    public void iterateUsingLambda(TreeMap<Transaction, Date> map){
        map.forEach((k,v)-> System.out.println(k+ ":" +v));
    }

    public void iterateUsingForEach(TreeMap<Transaction, Date> map){
        if(CollectionUtils.isNotEmpty(map.keySet())){
            Set<Map.Entry<Transaction, Date>> set = map.entrySet();
            for(Map.Entry<Transaction, Date> entry: set){
                System.out.println(entry.getKey()+ ":" +entry.getValue());
            }

        }
    }

    public void iterateUsingWhileLoop(TreeMap<Transaction, Date> map){
        if(CollectionUtils.isNotEmpty(map.keySet())){
            System.out.println("forward direction");
            Iterator<Transaction> iterator = map.keySet().iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }
    }
}
