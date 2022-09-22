package com.emexo.variables;

public class Product {

    // static variable
    public static final String CATEGORYNAME="CHOCOLOATE";

    // instance variable
    public int productId=10;
    public String productName="Perk";

    public static void main(String[] args) {

        //Allocating memory space at a time of class loading
        System.out.println(Product.CATEGORYNAME);

        // Allocating memory space when creating a object
        Product pro = new Product();
        System.out.println(pro.productId);
        System.out.println(pro.productName);


    }


}
