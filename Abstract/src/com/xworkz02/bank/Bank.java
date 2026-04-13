package com.xworkz02.bank;

public interface Bank {

    void user();

    void transaction();

    default void  bankId(){
        System.out.println("The bank id is not change.");
    }
}
