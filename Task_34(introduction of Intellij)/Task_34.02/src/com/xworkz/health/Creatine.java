package com.xworkz.health;

public class Creatine {
    String brand;
    double price;
    int count;

    public Creatine(String brand, double price, int count) {
        this.brand = brand;
        this.price = price;
        this.count = count;
    }

    public void creatineInfo(){
        System.out.println("The brand name of creatine:"+this.brand);
        System.out.println("The price of creatine:"+this.price);
        System.out.println("The brand name of creatine:"+this.count);
    }
}
