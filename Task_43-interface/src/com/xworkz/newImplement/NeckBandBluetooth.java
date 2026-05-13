package com.xworkz.newImplement;

import com.xworkz.interfaceClass.Bluetooth;

public class NeckBandBluetooth implements Bluetooth {
    @Override
    public void connect() {
        System.out.println("The connect method is implemented in NeckbandBluetooth.");
    }

    @Override
    public void disConnect() {
        System.out.println("The disconnect method is implemented in NeckbandBluetooth.");
    }
}
