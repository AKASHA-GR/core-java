package com.xworkz.curd;

public class President {
    String name;
    int age;
    Address address;

    public President(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

     public void presidentInfo(){
         System.out.println("President name:"+this.name);
         System.out.println("President age:"+this.age);
         address.addressInfo();
     }
}
