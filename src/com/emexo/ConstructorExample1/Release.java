package com.emexo.ConstructorExample1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Release {

    // Static variable
    public static final String SOFTWARE="ADOBE";

    // Instance varaible
    public int softVersion;
    public String softVendor;

    private Application application;

    private Ticket ticket;

    // parameterized constructor declared loosely coupled
    public Release(int ver, String vendor, Application application, Ticket ticket) {
        this.softVersion = ver;
        this.softVendor = vendor;
        this.application = application;
        this.ticket = ticket;
    }

    // Print static method
    public static void getSoftwareName() {
        System.out.println(Release.SOFTWARE);
    }

    // Print instance method
    public void getReleaseDetails()
    {
        System.out.println(softVersion + ":" + softVendor);
        application.getApplicationDetails();
        ticket.getTicketDetails();

    }
}
