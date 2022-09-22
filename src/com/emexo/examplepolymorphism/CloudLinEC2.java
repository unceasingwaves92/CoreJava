package com.emexo.examplepolymorphism;

public class CloudLinEC2 implements PEM{

    @Override
    public void existingKey(String commonKey) {
        System.out.println("Select existing key is already created: "+ commonKey);
    }

    @Override
    public void dowloadNewKey(String newKey) {
        System.out.println("Select new download key pair: "+ newKey);
    }
}
