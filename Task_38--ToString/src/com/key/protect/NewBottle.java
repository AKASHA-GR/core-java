package com.key.protect;

public class NewBottle extends Bottle{

    public NewBottle(int price, int quantity, String color, String quality) {
        super(price, quantity, color, quality);
    }

    @Override
    public void Store() {
        super.Store();
    }

    public void display(){
        Store();
    }
}
