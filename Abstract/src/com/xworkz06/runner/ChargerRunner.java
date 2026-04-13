package com.xworkz06.runner;

import com.xworkz06.charger.Charger;
import com.xworkz06.charger.LaptopCharger;

public class ChargerRunner {
    public static void main(String[] args) {
        Charger ref = new LaptopCharger();
        ref.material();
        ref.price();
        ref.vltInput();
    }
}
