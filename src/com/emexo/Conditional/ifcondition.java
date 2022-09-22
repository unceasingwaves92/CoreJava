package com.emexo.Conditional;

public class ifcondition {

    public void conditionWithSingleIf(int age, int age1){
        if(age > age1){
            System.out.println("Valid age");
        }
    }

    public void conditionWithMultipleIf(int age, int age1){
        if(age >= age1){
            System.out.println("Valid age");
        }
        else {
            System.out.println("Invalid age");
        }
    }

    public void conditionWithMultipleLess(int age, int age1){
        if (age > age1){
            System.out.println("Valid age");
        }
        else if (age == age1) {
            System.out.println("Equal age");
        }
        else if (age >= age1){
            System.out.println("Greater age");
        }
        else {
            System.out.println("Invalid age");
        }

    }

    public void conditionWithMultipleIfelse(int age, int age1){
        if (age > age1)
        {
            System.out.println("Age is less than");
        }
        else if(age > age1)
        {
            System.out.println("Age is greater than");
        }
        else {
            System.out.println("Invalid age");
        }
    }
}
