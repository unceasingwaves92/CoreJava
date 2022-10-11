package com.emexo.treeset;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Iterator;
import java.util.Set;

public class OperationBank {

    public void iterateUsingLambda(Set<Bank> set){

        set.forEach(data-> System.out.println(data.getBankIfscCode()+ ":" +data.getBankName()+ ":" +data.getBankBranch()));
    }

    public void iterateUsingForEach(Set<Bank> set){
        if(CollectionUtils.isNotEmpty(set)){
            for(Bank bank: set){
                System.out.println(bank.getBankIfscCode()+ ":" +bank.getBankName()+ ":" +bank.getBankBranch());
            }
        }
    }

    public void iterateUsingForWhile(Set<Bank> set){
        if(CollectionUtils.isNotEmpty(set)){
            System.out.println("Forward direction");
            Iterator<Bank> iterator = set.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }
}
