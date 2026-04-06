package com.xworkz.runner;

import com.xworkz.app.Cake;
import com.xworkz.app.Chocolate;

public class ChocolateCakeRunner {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("Milky bar",20,447);
        chocolate.chocolateInfo();
        System.out.println();

        Cake cake = new Cake("Chocolate","Black Forest",800);
        cake.cakeInfo();
    }
}
