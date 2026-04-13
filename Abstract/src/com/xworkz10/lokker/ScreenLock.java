package com.xworkz10.lokker;

public class ScreenLock implements Locker{
    @Override
    public void lock() {
        System.out.println("The screen locker is set... ");
    }

    @Override
    public void unlock() {
        System.out.println("The screen is unlock by enter correct password..");
    }
}
