package com.xworkz.pahalgam;

public class NonStaticMethods {
    public static void main(String[] args) {

        String name = "Akasha";

        String newName = new String("Akasha");

        System.out.println("When we use == with literal and new:-"+(name == newName));
        System.out.println("When we use .equals() with literal and new:-"+(name.equals(newName)));
        System.out.println();

        System.out.println(name.toUpperCase());

        String fullName = name+" "+"Gummanar";
        System.out.println(fullName);
        System.out.println("The name with .toUpperCase method:-"+(fullName.toUpperCase()));
        System.out.println("The name with .toLowerCase method:-"+(fullName.toLowerCase()));
        System.out.println();

        String car = "BMW";
        String car1 = "bmw";
        System.out.println("Comparing car with car1 using .equalsIgnoreCase method:-"+(car.equalsIgnoreCase(car1)));
        System.out.println();

        System.out.println("Finding the length of the name using .lenth() method:-"+(name.length()));
        System.out.println(fullName.length());
        System.out.println();

        System.out.println("Finding the charector using .charAT method:- "+(fullName.charAt(3)));
        System.out.println("Finding the charector using .charAT method:- "+(fullName.charAt(8)));
        System.out.println("Finding the charector using .charAT method:- "+(fullName.charAt(2)));
        System.out.println("Finding the charector using .charAT method:- "+(fullName.charAt(7)));
        System.out.println();

        System.out.println(fullName.contains("Gummanar"));
    }
}
