package com.xworkz.creater;

public class Toy {
    String type;
    String name;
    String material;
    double price;
    boolean isElectric;

    public Toy(String type, String name, String material, double price, boolean isElectric) {
        this.type = type;
        this.name = name;
        this.material = material;
        this.price = price;
        this.isElectric = isElectric;
    }

    public void displayInfo(){
        System.out.println("The type of the toy:"+this.type);
        System.out.println("The name of the toy:"+this.name);
        System.out.println("The material of the toy:"+this.material);
        System.out.println("The price of the toy:"+this.price);
        System.out.println("The toy is Electric:"+this.isElectric);
    }
}
