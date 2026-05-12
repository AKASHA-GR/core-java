package com.xworkz.work;

public interface WaterTack {

    String brand ="WaterTec";
    int numberOfLetter = 1000;
    String material = "Plastic";

    void size();
    void capacity();

    default void price(){
        System.out.println("The price of 1000 litter watertack is 4000.");
    }

    default void warranty(){
        System.out.println("The water tack have 1 year warranty.");
    }

    static void brandInfo(){
        System.out.println("The Watertec is a indian brand.");
    }
}
