package com.emexo.treeset;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class BankMain {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.setBankIfscCode(123);
        b1.setBankName("ICICI");
        b1.setBankBranch("Tambaram");
        Bank b2 = new Bank();
        b2.setBankIfscCode(123);
        b2.setBankName("Axis");
        b2.setBankBranch("Porur");
        Bank b3 = new Bank();
        b3.setBankIfscCode(345);
        b3.setBankName("SBI");
        b3.setBankBranch("KKNagar");
        Bank b4 = new Bank();
        b4.setBankIfscCode(678);
        b4.setBankName("IDFC");
        b4.setBankBranch("KKNagar");

        Set<Bank> set = new TreeSet<>();
        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);

        OperationBank obj = new OperationBank();
         //  obj.iterateUsingForWhile(set);
          obj.iterateUsingForEach(set);


    }
}
