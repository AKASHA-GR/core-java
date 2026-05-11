package com.xworkz.work;

public interface War {
    String country = "America";
    String year = "2026";
    boolean active = true;


    void attack();
    void defence();

    default void loss(){
        System.out.println("The financial loss.");
    }

    default void gain(){
        System.out.println("The wan a the land");
    }

    static void result(){
        System.out.println("The result is wining or losing.");
    }

}
