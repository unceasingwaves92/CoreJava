package com.emexo.bounded;

public class MainUpper {
    public static void main(String[] args) {
        UpperBound<Integer> obj = new UpperBound();
        obj.setT(new Integer(10));
        System.out.println(obj.getT());

    }
}
