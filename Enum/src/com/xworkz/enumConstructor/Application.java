package com.xworkz.enumConstructor;

public abstract class Application {
    CountryCode countryCode;

    public void run(){
        System.out.println("In abstract class there is a two type that is 1.with abstract methods, 2.with out abstract methods");
        System.out.println("The concrete method or regular method  ");
    }

    public abstract void pause();

}
