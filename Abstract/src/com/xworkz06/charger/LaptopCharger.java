package com.xworkz06.charger;

public class LaptopCharger implements Charger{

    @Override
    public void price() {
        System.out.println("The laptop charger is depending on company...");
    }

    @Override
    public void material() {
        System.out.println("The material is used - plastic,steal,copper...");
    }
}
