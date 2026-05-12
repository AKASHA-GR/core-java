package com.xworkz.usage;

import com.xworkz.interfaceClass.Bluetooth;

public class Device {
    private Bluetooth bluetooth;

    public Device(Bluetooth bluetooth){
        this.bluetooth = bluetooth;
    }

    public void play(){
        System.out.println("The play is running in class Device.");

        if(this.bluetooth != null){
            this.bluetooth.connect();
            this.bluetooth.disConnect();
        }
    }
}
