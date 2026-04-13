package com.xworkz08.Phone;

public interface Phone {

    void Storage();

    void processor();

    default void screen(){
        System.out.println("The all phone have the screen....");
    }
}
