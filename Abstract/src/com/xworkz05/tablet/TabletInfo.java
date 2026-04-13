package com.xworkz05.tablet;

public class TabletInfo implements Tablet{

    @Override
    public void chemical() {
        System.out.println("The new chemical is add to tablet...");
    }

    @Override
    public void effects() {
        System.out.println("The effects are controlled by users...");
    }
}
