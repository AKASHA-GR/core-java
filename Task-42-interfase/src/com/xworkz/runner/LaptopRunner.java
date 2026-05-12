package com.xworkz.runner;

import com.xworkz.work.Laptop;
import com.xworkz.work.LaptopInfo;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new LaptopInfo();

        laptop.graphicCard();
        laptop.processor();
        laptop.warranty();
        laptop.guarantee();

        Laptop.rgbLight();

        System.out.println(Laptop.brand);
        System.out.println(Laptop.name);
        System.out.println(Laptop.price);
    }
}
