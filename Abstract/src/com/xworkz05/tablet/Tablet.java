package com.xworkz05.tablet;

public interface Tablet {

    void chemical();
    void effects();

    default void cost(){
        System.out.println("The cost is defined by company...");
    }
}
