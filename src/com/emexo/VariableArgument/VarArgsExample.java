package com.emexo.VariableArgument;

public class VarArgsExample {

    public void method(int... input){
        int[] array = input;
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void method1(int... numbers){
        int sum = 0;
        int[] array = numbers;
        for(int i =0; i< numbers.length; i++){
            sum = sum + array[i];
            System.out.println(sum);
        }
        System.out.println("added numbers");
    }
}
