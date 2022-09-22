package com.emexo.primitivedatatype;

public class Main {

    // Create Main method/ Create object and call the instance method
    public static void main(String[] args) {
        DataType obj = new DataType((byte)10, true, (short)5, 172, 75l, 100.00f, 123.45, 'k');
        obj.getDataTypeDetails();
    }
}
