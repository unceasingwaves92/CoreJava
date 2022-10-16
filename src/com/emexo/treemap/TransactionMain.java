package com.emexo.treemap;

import java.util.Collections;
import java.util.Date;
import java.util.TreeMap;

public class TransactionMain {

    public static void main(String[] args) {
        Transaction tran1 = new Transaction();
        tran1.setAccountNo(300);
        tran1.setAccountName("karthik");
        tran1.setAmount(10000);
        Transaction tran2 = new Transaction();
        tran2.setAccountNo(200);
        tran2.setAccountName("regu");
        tran2.setAmount(50000);
        Transaction tran3 = new Transaction();
        tran3.setAccountNo(100);
        tran3.setAccountName("divya");
        tran3.setAmount(80000);
        Transaction tran4 = new Transaction();
        tran4.setAccountNo(100);
        tran4.setAccountName("Ranjana");
        tran4.setAmount(90000);

        TreeMap<Transaction, Date> map = new TreeMap<>();
        map.put(tran1, new Date());
        map.put(tran2, new Date());
        map.put(tran3, new Date());
        map.put(tran4, new Date());
        TransactionList obj = new TransactionList();
      //  obj.iterateUsingLambda(map);
          obj.iterateUsingForEach(map);

    }
}
