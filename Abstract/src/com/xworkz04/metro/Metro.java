package com.xworkz04.metro;

public interface Metro {

    void budget();

    void donation();

    default void numberOfMetro(){
        System.out.println("There are 3 metro are running currently..");
    }
}
