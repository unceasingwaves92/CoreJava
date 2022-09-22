package com.emexo.Autoboxing;

public class Main {

    public static void main(String[] args) {

        // convert object format to corresponding primitive data type
        Wrapper wrap = new Wrapper((byte) 10, (short) 2, 400, 10l, 23.0f, 12.03, true, 'k');
        wrap.getWrapperDetails();
    }
}
