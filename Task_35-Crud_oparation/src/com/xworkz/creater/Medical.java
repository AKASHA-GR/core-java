package com.xworkz.creater;

public class Medical {
    String collegeName;
    double fee;
    String location;
    double rating;
    int totleSeats;

    public Medical(String collegeName, double fee, String location, double rating, int totleSeats) {
        this.collegeName = collegeName;
        this.fee = fee;
        this.location = location;
        this.rating = rating;
        this.totleSeats = totleSeats;
    }

    public void displayInfo(){
        System.out.println("The college name:"+this.collegeName);
        System.out.println("The college fee:"+this.fee);
        System.out.println("The college location:"+this.location);
        System.out.println("The college rating:"+this.rating);
        System.out.println("The college totle Seats:"+this.totleSeats);
    }
}
