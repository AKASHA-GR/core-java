package com.xworkz.usage;

import com.xworkz.interfaceClass.Door;

import java.util.Objects;

public class Room {

    private Door door;

    public void setDoor(Door door) {
        this.door = door;
    }

    public void key(){
        if(Objects.nonNull(this.door)){
            this.door.close();
            this.door.open();
        }
    }
}
