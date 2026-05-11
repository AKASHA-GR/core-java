package com.xworkz.work;

public interface Tool {
    String tool_name = "ChatGPT";
    int version = 4;
    boolean active = true;


    void open();
    void close();

    default void login(){
        System.out.println("Login successful");
    }

    default void logout(){
        System.out.println("Logout successful");
    }

    static void info(){
        System.out.println("The chatGPT is AI model");
    }
}
