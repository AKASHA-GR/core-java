package com.xworkz.app;

public class Cake {
    String flavour;
    String type;
    double price;

    public Cake(String flavour, String type, double price) {
        this.flavour = flavour;
        this.type = type;
        this.price = price;
    }

    public void cakeInfo(){
        System.out.println("The cake flavour:"+this.flavour);
        System.out.println("The cake type:"+this.type);
        System.out.println("The cake price:"+this.price);
    }
}
