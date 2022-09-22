package com.emexo.ExceptionHandling;

public class newMain {

    public static void main(String[] args) {
        singleCatchBlock obj = new singleCatchBlock();
        obj.string(null);

        singleCatchBlock obj1 = new singleCatchBlock();
        obj1.divide(100, 0);
    }


}
