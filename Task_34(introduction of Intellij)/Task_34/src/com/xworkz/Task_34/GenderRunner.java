package com.xworkz.Task_34;

import com.xworkz.Kitkat.Developer;

public class GenderRunner {
    public static void main(String[] args) {
        System.out.println("I am Started writing code in IntelliJ.");
        Gender gender = new Gender("Akasha GR",22,true);
        gender.info();
        System.out.println();

        String[] skills = {"Java","Python","HTML","CSS"};
        Developer developer = new Developer("Ragavendra",3,skills);
        developer.devInfo();
    }
}
