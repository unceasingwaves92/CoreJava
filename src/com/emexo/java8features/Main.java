package com.emexo.java8features;

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface data = () -> {
            System.out.println("executing");
            System.out.println("Lambda executing");
        };
        data.execute();

        Addition addition = (a, b) -> {
           return a+b;
        };

        int response = addition.add(10, 20);
        System.out.println(response);

        ConcatExample example = (a, b) -> {
            return a+b;
        };
        String input = example.sum("Karthik", " " +"Kalyanachidambaram");
        System.out.println(input);


    }
}
