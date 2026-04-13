package com.xworkz07.bulb;

public interface Bulb {

    void price();
    void voltage();

    default void useCurrent(){
        System.out.println("The bulb is use the Current....");
    }
}
