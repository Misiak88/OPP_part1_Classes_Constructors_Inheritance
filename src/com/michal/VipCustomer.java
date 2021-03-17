package com.michal;

public class VipCustomer {
    
    private String name;
    private String emailAddress;
    private int creditLimit;

    public VipCustomer(){
        this("Default name", "Default email", 0);
    }

    public VipCustomer(String name, int creditLimit) {
        this(name,"unknown@email.com",creditLimit);
    }

    public VipCustomer(String name, String emailAddress, int creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
