package com.xworkz.runner;

import com.xworkz.work.WaterTack;
import com.xworkz.work.WaterTackInfo;

public class WaterTackRunner {
    public static void main(String[] args) {
        WaterTack waterTack = new WaterTackInfo();

        waterTack.price();
        waterTack.size();
        waterTack.capacity();
        waterTack.warranty();


        WaterTack.brandInfo();

        System.out.println(WaterTack.material);
        System.out.println(WaterTack.brand);
        System.out.println(WaterTack.numberOfLetter);
    }
}
