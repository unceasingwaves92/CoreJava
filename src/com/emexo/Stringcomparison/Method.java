package com.emexo.Stringcomparison;

public class Method {

    public static void main(String[] args) {
        StringBui buffer = new StringBui();
        System.out.println(buffer.getStringBuffer("karthik", "kalyanachidambaram"));
        System.out.println(buffer.getStrBuilder("k", "." + " "  + "karthikeyan", "kalyanachidambaram"));
        System.out.println(buffer.getStrBuffer("1", " " + " " +"Plot no 5", "." + "Jaya nagar", "." + "Perumbakkam"));
    }
}
