package com.emexo.Switch;

public class Main {

    public static void main(String[] args) {

        SwitchCaseExample obj = new SwitchCaseExample();
        String res = obj.findDayOfWeek("default");
        System.out.println("Response is: "+ res);
        System.out.println(obj.findDayOfWeek("Friday"));

        SwitchcaseExample1 mon = new SwitchcaseExample1();
        String resmon = mon.findDayOfMonth("April");
        System.out.println("Response of month is: "+ resmon);


    }




}
