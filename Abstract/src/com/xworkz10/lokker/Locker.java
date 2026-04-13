package com.xworkz10.lokker;

public interface Locker {

    void lock();

    void unlock();

    default void key(){
        System.out.println("The key is required for the open and lock.....");
    }
}
