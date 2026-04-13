package com.xworkz07.bulb;

public class LED implements Bulb{

    @Override
    public void price() {
        System.out.println("The LED price is depending on the price...");
    }

    @Override
    public void voltage() {
        System.out.println("The voltage is also decided by the company....");
    }
}
