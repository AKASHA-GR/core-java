package com.xworkz.work;

public class WarInfo implements War{
    @Override
    public void attack() {
        System.out.println("The army attack the enemy.");
    }

    @Override
    public void defence() {
        System.out.println("The army defended by enemy.");
    }
}
