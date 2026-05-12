package com.xworkz.interfaceClass;

public class TataRemote implements Remote{
    @Override
    public void turnOn() {
        System.out.println("The turnOn TV.");
    }

    @Override
    public void turnOff() {
        System.out.println("The turnOff TV.");
    }
}
