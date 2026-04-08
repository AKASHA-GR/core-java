package com.xworkz.creater;

public class PanCard {
    String name;
    int age;
    long mobileNo;
    String email;
    String expiryYear;

    public PanCard(String name, int age, long mobileNo, String email, String expiryYear) {
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
        this.email = email;
        this.expiryYear = expiryYear;
    }

    public void displayInfo(){
        System.out.println("The pan card olderName:"+this.name);
        System.out.println("The pan card older age:"+this.age);
        System.out.println("The pan card older mobile number:"+this.mobileNo);
        System.out.println("The pan card older email Id:"+this.email);
        System.out.println("The pan card expiry date:"+this.expiryYear);
    }
}
