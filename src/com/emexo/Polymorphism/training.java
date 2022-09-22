package com.emexo.Polymorphism;

public class training {

    public void teach(Animal animal, int running){
        animal.move(running);
    }

    public void test(Animal animal, int sound){
        animal.roaring(sound);
    }
}
