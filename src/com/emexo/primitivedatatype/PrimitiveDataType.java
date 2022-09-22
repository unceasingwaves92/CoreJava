package com.emexo.primitivedatatype;

public class PrimitiveDataType {

    private byte bytevalue=10;
    private short shortvalue=200;
    private int integervalue=4000;
    private long longvalue=245l;
    private float floatvalue=12.01f;
    private double doublevalue=133.0;
    private boolean booleanvalue= true;
    private char charvalue = 'k';


    public static void main(String[] args) {
        PrimitiveDataType dataType = new PrimitiveDataType();
        System.out.println(dataType.floatvalue);
        System.out.println(dataType.longvalue);

    }
}