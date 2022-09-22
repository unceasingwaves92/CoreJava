package com.emexo.Unary;

public class PrePostIncre {

    public void preIncr(int n){

        System.out.println("The postincrement value: "+ n++);
        System.out.println("The postincrement value: "+ n);
    }

    public void postIncre(int n){
        System.out.println("The postincrement value: "+ ++n);
    }

    public void preDec(int n) {
        System.out.println("The postdecrement value: "+ n--);
        System.out.println("The postdecrement value: "+ n);
        System.out.println("The postIncrement value: "+ n++);
        System.out.println("The postIncrement value: "+ n);
    }

    public void postDec(int n){
        System.out.println("The predecrement value: "+ --n);
        System.out.println("The preIncrement value: "+ ++n);
    }
}
