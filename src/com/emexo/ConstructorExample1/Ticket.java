package com.emexo.ConstructorExample1;

public class Ticket {

    // Static variable
    public static final String MOVIE="VIKRAM";

    // Instance variable
    public int ticPrice;
    public String ticTheatre;

    public Ticket(int price, String theatre) {
        this.ticPrice = price;
        this.ticTheatre = theatre;
    }

    // Print static method
    public static void getMovieName(){
        System.out.println(Ticket.MOVIE);
    }
    // Print instance method
    public void getTicketDetails(){
        System.out.println(ticPrice + ":" + ticTheatre);
    }
}
