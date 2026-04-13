package com.xworkz07.runner;

import com.xworkz07.bulb.Bulb;
import com.xworkz07.bulb.LED;

public class BulbRunner {
    public static void main(String[] args) {
        Bulb ref = new LED();
        ref.price();
        ref.voltage();
        ref.useCurrent();
    }
}
