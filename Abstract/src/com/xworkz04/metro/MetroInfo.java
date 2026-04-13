package com.xworkz04.metro;

public class MetroInfo implements Metro{

    @Override
    public void budget() {
        System.out.println("The budget is expanded by private organisation....");
    }

    @Override
    public void donation() {
        System.out.println("The private organisations are donating for metro....");
    }
}
