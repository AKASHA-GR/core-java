package com.xworkz09.validation;

public interface Validation {
    void userName();

    void password();

    default void submit(){
        System.out.println("The submit the from...");
    }
}
