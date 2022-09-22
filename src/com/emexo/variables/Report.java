package com.emexo.variables;

public class Report {

    public static final String REGION="CHENNAI";

    public int reportId=100;
    public String reportName="Karthikeyan";

    public static void main(String[] args) {




        //Allocating memory space at a time of class loading
        System.out.println(Report.REGION);

        // Allocating memory space when creating a object
        Report repvalue = new Report();

        System.out.println(repvalue.reportId);
        System.out.println(repvalue.reportName);




    }

}
