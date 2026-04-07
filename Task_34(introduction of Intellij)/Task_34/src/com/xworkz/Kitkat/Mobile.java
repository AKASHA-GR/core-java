package com.xworkz.Kitkat;

public class Mobile {

    String name;
    double price;
    int quntity;

    public Mobile(String name,double price, int quntity) {
        this.name = name;
        this.price = price;
        this.quntity=quntity;
    }

     public void mobileInfo(){

        System.out.println("Executing the Mobile Deatiles :" );
        System.out.println("Name of the phone:"+ this.name);
        System.out.println("Price of the Mobile :"+this.price);
        System.out.println("Quntity of the phone :"+ this.quntity);


    }
}
