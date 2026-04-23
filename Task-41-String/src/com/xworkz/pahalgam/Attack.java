package com.xworkz.pahalgam;

public class Attack {
    public static void main(String[] args) {

        String name = "Nithin";

        String newName = new String("Nithin");

        System.out.println(name == newName);
        System.out.println(name.equals(newName));

        System.out.println(name.toUpperCase());

        String fullName = name+" "+"Kumar";
        System.out.println(fullName);
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());

        String car = "BMW";
        String car1 = "bmw";
        System.out.println(car.equalsIgnoreCase(car1));

        System.out.println(name.length());
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(3));
        System.out.println(fullName.contains("Kumar"));
    }
}
