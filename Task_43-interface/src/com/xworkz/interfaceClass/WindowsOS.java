package com.xworkz.interfaceClass;

public class WindowsOS implements OS {
    @Override
    public void boot() {
        System.out.println("The boot method is implemented from OS.");
    }

    @Override
    public void start() {
        System.out.println("The start method is implemented from OS.");
    }

    @Override
    public void stop() {
        System.out.println("The stop method is implemented from OS.");
    }
}
