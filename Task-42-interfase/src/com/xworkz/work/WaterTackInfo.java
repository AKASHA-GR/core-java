package com.xworkz.work;

public class WaterTackInfo implements WaterTack{
    @Override
    public void size() {
        System.out.println("The size is depending on the capacity.");
    }

    @Override
    public void capacity() {
        System.out.println("The water tack hold 5000 to 2200000.");
    }
}
