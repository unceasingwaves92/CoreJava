package com.emexo.enumerator;

public class Main {

    public static void main(String[] args) {
      //  System.out.println(Country.usa);
      //  System.out.println(Country.usa.getCurrency());

        for(Country code: Country.values()){
            System.out.println(code.getCurrency());
        }

    }
}
