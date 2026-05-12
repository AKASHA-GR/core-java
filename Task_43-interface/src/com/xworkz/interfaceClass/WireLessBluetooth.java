package com.xworkz.interfaceClass;

public class WireLessBluetooth implements Bluetooth{
    @Override
    public void connect() {
        System.out.println("The connect method is runing in class WireLessBLuetooth");
    }

    @Override
    public void disConnect() {
        System.out.println("The disconnect method is runing in class WireLessBLuetooth");
    }
}
