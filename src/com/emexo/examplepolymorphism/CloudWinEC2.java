package com.emexo.examplepolymorphism;

public class CloudWinEC2 implements PEM {


    @Override
    public void existingKey(String commonKey) {
        System.out.println("Select existing PEM key: "+ commonKey);
    }

    @Override
    public void dowloadNewKey(String newKey) {
        System.out.println("Select new download key pair: "+ newKey);
    }
}
