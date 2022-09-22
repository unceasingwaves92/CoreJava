package com.emexo.ConstructorExample1;

public class Application {

    // Static variable
    public static final String APP_NAME = "ANGRY BIRDS";

    // Instance variable
    public int appVersion;
    public boolean appOpenSource;

    public Application(int version, boolean opensource){

        this.appVersion = version;
        this.appOpenSource = opensource;
    }

    // Print static method

    public static void getApplication() {
        System.out.println(Application.APP_NAME);
    }

    // Print instance method
    public void getApplicationDetails() {

        System.out.println(appVersion + ":" + appOpenSource);
    }

}
