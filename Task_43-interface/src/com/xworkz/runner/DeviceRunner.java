package com.xworkz.runner;

import com.xworkz.interfaceClass.Bluetooth;
import com.xworkz.interfaceClass.WireLessBluetooth;
import com.xworkz.usage.Device;

public class DeviceRunner {
    public static void main(String[] args) {
        Bluetooth bluetooth = new WireLessBluetooth();

        Device device = new Device(bluetooth);

        device.play();
    }
}
