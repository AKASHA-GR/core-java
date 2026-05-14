package com.xworkz.newImplement;

import com.xworkz.interfaceClass.Door;

public class WoodDoor implements Door {
    @Override
    public void open() {
        System.out.println("The open method is run on woodDoor");
    }

    @Override
    public void close() {
        System.out.println("The close method is run on woodDoor");
    }
}
