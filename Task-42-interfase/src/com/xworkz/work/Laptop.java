package com.xworkz.work;

public interface Laptop {

    String brand = "Dell";
    String name = "Dell 5515";
    double price = 72000;


    default void warranty(){
        System.out.println("The warranty is 1 year.");
    }
    default void guarantee(){
        System.out.println("There is no guarantee.");
    }

    void processor();
    void graphicCard();

    static void rgbLight(){
        System.out.println("it have RGB light.");
    }

}
