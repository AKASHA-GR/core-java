package com.xworkz.enumConstructor;

public class Runner {
    public static void main(String[] args) {
        //abstract class information
    MobileApplication mobileApplication = new MobileApplication();
    mobileApplication.run();
    mobileApplication.pause();
    System.out.println();


    //enum with constructor
        System.out.println(CountryCode.IND.getCode());
        System.out.println(CountryCode.USA.getCode());
        System.out.println(CountryCode.UAE);
        System.out.println(CountryCode.UK);
    }
}
