package com.xworkz.newImplement;

import com.xworkz.interfaceClass.Remote;

public class AdaniRemote implements Remote {
    @Override
    public void turnOn() {
        System.out.println("The turnOn method is implemented in Adani Remote.");
    }

    @Override
    public void turnOff() {
        System.out.println("The turnOff method is implemented in Adani Remote.");
    }
}
