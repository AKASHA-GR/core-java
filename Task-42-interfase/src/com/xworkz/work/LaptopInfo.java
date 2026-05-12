package com.xworkz.work;

public class LaptopInfo implements Laptop{
    @Override
    public void processor() {
        System.out.println("it have i5 core processor.");
    }

    @Override
    public void graphicCard() {
        System.out.println("it have NVD 3050.");
    }
}
