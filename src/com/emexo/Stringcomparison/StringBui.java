package com.emexo.Stringcomparison;

public class StringBui {

    public String getStringBuilder(){

        StringBuilder builder = new StringBuilder("Karthik");
        builder.append("Kalyanachidambaram");
        return builder.toString();

    }

    public String getStringBuffer(String str1, String str2) {
        StringBuffer buffer = new StringBuffer(str1);
        buffer.append(str2);
        return buffer.toString();

    }

    public String getStrBuilder(String str1, String str2, String str3){
        StringBuilder builder = new StringBuilder(str1);
        builder.append(str2);
        builder.append(str3);
        return builder.toString();

    }

    public String getStrBuffer(String str1, String str2, String str3, String str4){
        StringBuffer buffer = new StringBuffer(str1);
        buffer.append(str2);
        buffer.append(str3);
        buffer.append(str4);
        return buffer.toString();

    }


}
