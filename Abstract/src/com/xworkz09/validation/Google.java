package com.xworkz09.validation;

public class Google implements Validation {


    @Override
    public void userName() {
        System.out.println("The user is exist.....");
    }

    @Override
    public void password() {
        System.out.println("The password is set.....");
    }
}
