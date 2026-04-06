package com.xworkz.app;

public class Chocolate {
    String name;
    double price;
    int calories;

    public Chocolate(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public void chocolateInfo(){
        System.out.println("The chocolate name:"+this.name);
        System.out.println("The chocolate price:"+this.price);
        System.out.println("The number of calories in chocolate:"+this.price);
    }
}
