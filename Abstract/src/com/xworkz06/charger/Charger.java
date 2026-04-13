package com.xworkz06.charger;

public interface Charger {

    void price();
    void material();

    default void vltInput(){
        System.out.println("The input of the charger is 220Volt....");
    }
}
