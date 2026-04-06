package com.xworkz.Task_34;

public class Gender {
    String name;
    int age;
    boolean isAdult;

    public Gender(String name, int age, boolean isAdult) {
        this.name = name;
        this.age = age;
        this.isAdult = isAdult;
    }

    void info(){
        System.out.println("The name of the person:"+this.name);
        System.out.println("The age of the person:"+this.age);
        System.out.println("The person is Adult:"+this.isAdult);
    }
}
