package com.xworkz.runner;

import com.xworkz.interfaceClass.Door;
import com.xworkz.newImplement.WoodDoor;
import com.xworkz.usage.Room;

public class RoomRunner {
    public static void main(String[] args) {

        Door door = new WoodDoor();

        Room room = new Room();
        room.setDoor(door);

        room.key();

    }
}
