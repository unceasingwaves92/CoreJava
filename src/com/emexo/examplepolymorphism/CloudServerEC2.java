package com.emexo.examplepolymorphism;

public class CloudServerEC2 implements PEM{
    @Override
    public void existingKey(String commonKey) {
        System.out.println("Use existing key: "+ commonKey);
    }

    @Override
    public void dowloadNewKey(String newKey) {
        System.out.println("Use new key: "+ newKey);
    }
}
