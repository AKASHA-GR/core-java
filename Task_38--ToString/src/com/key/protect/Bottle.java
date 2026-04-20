package com.key.protect;

public class Bottle {

    int price;
    int quantity;
    String color;
    String quality;

    public Bottle(int price, int quantity, String color, String quality) {
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.quality = quality;
    }



    protected void Store(){
        System.out.println("The bottle store water.");
    }
}
