// Package name should name lowercase first and second uppercase
package com.emexo.CustomExample;

// Class name Always capital first and second string uppercase
public class customException extends Exception {

    public customException() {
        super();
    }

    public customException(String msg) {
        super(msg);
    }

    public customException(Throwable t, String msg) {
        super(msg, t);
    }

}