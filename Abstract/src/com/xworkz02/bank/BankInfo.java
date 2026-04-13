package com.xworkz02.bank;

public class BankInfo implements Bank {

    @Override
    public void user() {
        System.out.println("The user can add........");
    }

    @Override
    public void transaction() {
        System.out.println("The transaction is down by users........");
    }
}
