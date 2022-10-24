package com.emexo.generic;

public class RawExample<T> implements Raw<T> {

    private T key;
    private T value;

    public RawExample(T key, T value){
        this.key = key;
        this.value = value;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public T getValue() {
        return value;
    }
}
