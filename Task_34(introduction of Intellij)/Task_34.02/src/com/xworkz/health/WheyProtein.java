package com.xworkz.health;

public class WheyProtein {
    String brand;
    double price;
    int protein;

    public WheyProtein(String brand, double price, int protain) {
        this.brand = brand;
        this.price = price;
        this.protein = protain;
    }

    public void wheyProteinInfo(){
        System.out.println("The brand name of WheyProtein:"+this.brand);
        System.out.println("The price of WheyProtein:"+this.price);
        System.out.println("The Totle Whey Protein:"+this.protein);
    }
}
