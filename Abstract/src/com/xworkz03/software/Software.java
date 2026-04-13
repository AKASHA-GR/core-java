package com.xworkz03.software;

public interface Software {

    void frontend();

    void backend();

    default void validation(){
        System.out.println("The validation is must for every user........");
    }


}
