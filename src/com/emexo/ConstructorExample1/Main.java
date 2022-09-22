package com.emexo.ConstructorExample1;

public class Main {
    public static void main(String[] args) {

        // loosely coupled main method
        Application app = new Application(1, true);
        Ticket ticket = new Ticket(240, "AGS");

        Release rel = new Release(12, "Adobe network", app, ticket);
        rel.getReleaseDetails();
    }
}
