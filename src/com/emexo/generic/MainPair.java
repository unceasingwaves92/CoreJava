package com.emexo.generic;

public class MainPair {
    public static void main(String[] args) {
       OrderedPair<String, Integer> obj = new OrderedPair<>("Even", 2);
        System.out.println(obj.getKey());
        System.out.println(obj.getValue());

        OrderedPair<Integer, String> obj1 = new OrderedPair<>(3, "Odd");
        System.out.println(obj1.getKey());
        System.out.println(obj1.getValue());

    }
}
