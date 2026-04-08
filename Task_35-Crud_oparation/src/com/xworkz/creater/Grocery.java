package com.xworkz.creater;

public class Grocery {
    String name;
    double rating;
    String location;
    int numberOfWorkers;
    boolean homeDelivery;

    public Grocery(String name, double rating, String location, int numberOfWorkers, boolean homeDelivery) {
        this.name = name;
        this.rating = rating;
        this.location = location;
        this.numberOfWorkers = numberOfWorkers;
        this.homeDelivery = homeDelivery;
    }


    public void displayInfo(){
        System.out.println("The name of grocery shop:"+this.name);
        System.out.println("The rating of grocery shop:"+this.rating);
        System.out.println("The location of grocery shop:"+this.location);
        System.out.println("The nubber of worker in grocery shop:"+this.numberOfWorkers);
        System.out.println("The grocery shop have home delivery:"+this.homeDelivery);
    }
}
