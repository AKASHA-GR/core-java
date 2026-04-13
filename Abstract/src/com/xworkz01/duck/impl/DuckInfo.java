package com.xworkz01.duck.impl;

import com.xworkz01.duck.Duck;

public class DuckInfo implements Duck {


    @Override
    public void fly() {
        System.out.println("The duck can fly......");
    }

    @Override
    public void quack() {
        System.out.println("The duck can quack.....");
    }
}
