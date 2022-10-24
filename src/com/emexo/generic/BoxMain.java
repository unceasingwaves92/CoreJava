package com.emexo.generic;

public class BoxMain {
    public static void main(String[] args) {
        Box<String> obj = new Box();
        obj.setType("Hi Hello Team");
        System.out.println(obj.getType());

        Box<Integer> obj1 = new Box();
        obj1.setType(5);
        System.out.println(obj1.getType());
    }
}
