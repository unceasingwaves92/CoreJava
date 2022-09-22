package com.emexo.AbstractExample;

public abstract class SecurityGroup {

    public static final int noOfPort=2;

    public int port;

    // parameterized constructor
    public SecurityGroup(int port){
        this.port=port;
    }

    // abstract method
    public abstract void inbound();

    public abstract void outbound();

    // common implementation
    public void commonSG(){
        System.out.println("Attach existing SG");
    }

    // instance method
  //  public void getSGDet(){
    //    System.out.println("The port value is: "+ port);
   // }

}
