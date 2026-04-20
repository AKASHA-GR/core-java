package com.key.protect;

public class run {
    public static void main(String[] args) {
        Bottle bottle = new Bottle(187,2,"blue","Good");
        Bottle bottle1 = new Bottle(187,2,"blue","Good");

        boolean equals = bottle.equals(bottle1);
        System.out.println(equals);
    }
}
