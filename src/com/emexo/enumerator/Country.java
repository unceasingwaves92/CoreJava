package com.emexo.enumerator;

public enum Country {

    // ENUM FIELDS
    usa("Dollar"), european("Euro"), India("Rupee"), SA("RCurrency");

    // constructor
    // Second call constructor to get currency value in main method
    private Country(final String currency) {
        this.currency = currency;

    }
    // Internal state
    private String currency;

    // First call with getcurrency in getter method in main method (its public)
    public String getCurrency(){
        return currency;
}

}
