package com.xworkz01.duck;

public interface Duck {

    void fly();

    public void quack();

    default void swim(){
        System.out.println("The all Duck can swim.");
    }
}
