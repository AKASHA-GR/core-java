package com.xworkz.creater;

public class Shop {
    String name;
    String location;
    double rent;
    double investment;
    double revenue;

    public Shop(String name, String location, double rent, double investment, double revenue) {
        this.name = name;
        this.location = location;
        this.rent = rent;
        this.investment = investment;
        this.revenue = revenue;
    }

    public void displayInfo(){
        System.out.println("The name of the shop:"+this.name);
        System.out.println("The location of the shop:"+this.location);
        System.out.println("The rent of the shop:"+this.rent);
        System.out.println("The investment of the shop:"+this.investment);
        System.out.println("The revenue of the shop:"+this.revenue);


    }
}
