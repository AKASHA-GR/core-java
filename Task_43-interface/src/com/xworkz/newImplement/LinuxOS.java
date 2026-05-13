package com.xworkz.newImplement;

import com.xworkz.interfaceClass.OS;

public class LinuxOS implements OS {
    @Override
    public void boot() {
        System.out.println("The boot method is implemented in LinuxOS.");
    }

    @Override
    public void start() {
        System.out.println("The start method is implemented in LinuxOS.");
    }

    @Override
    public void stop() {
        System.out.println("The stop method is implemented in LinuxOS.");
    }
}
