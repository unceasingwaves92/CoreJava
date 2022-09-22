package com.emexo.examplepolymorphism;

public class SecurityGroup {

    public void generateSG(){
        System.out.println("Create a new SG group");
    }

    public void existingSecurityGroup(PEM pem, String existingKey){
      pem.existingKey(existingKey);

    }

    public void newSecurityGroup(PEM pem, String downloadKey){
        pem.dowloadNewKey(downloadKey);

    }
}
