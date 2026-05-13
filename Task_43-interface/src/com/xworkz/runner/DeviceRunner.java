package com.xworkz.runner;

import com.xworkz.interfaceClass.Bluetooth;
import com.xworkz.interfaceClass.WireLessBluetooth;
import com.xworkz.newImplement.NeckBandBluetooth;
import com.xworkz.usage.Device;

public class DeviceRunner {
    public static void main(String[] args) {
        //old implementation
        Bluetooth bluetooth = new WireLessBluetooth();
        //new implementation
        Bluetooth bluetooth1 = new NeckBandBluetooth();

        Device device = new Device(bluetooth1);

        device.play();
    }
}
