package com.emexo.bounded;

public class LowerBoundExample<T> implements Lower<T> {

    private T type;

    public LowerBoundExample(T type){
        this.type =type;

    }



    @Override
    public T type() {
        return type;
    }
}
