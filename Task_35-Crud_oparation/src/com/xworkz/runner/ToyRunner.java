package com.xworkz.runner;

import com.xworkz.creater.Toy;
import com.xworkz.creater.ToyInfo;

public class ToyRunner {
    public static void main(String[] args) {

        Toy[] toy = new Toy[3];
        ToyInfo toyInfo = new ToyInfo(toy);

        Toy toy1 = new Toy("Educational","Curious Cub","Birchwood",2999,false);
        toyInfo.store(toy1);
        System.out.println();

        Toy toy2 = new Toy("Pretend Play","Wooden Kitchen Set","Plastic",160,false);
        toyInfo.store(toy2);
        System.out.println();

        Toy toy3 = new Toy("Stacking Toy","Baby Spinning","ABS Plastic",450,false);
        toyInfo.store(toy3);
        System.out.println();

        toyInfo.search("Educational");
        System.out.println();

        boolean ref = toyInfo.update("Curious Cub",3500);
        System.out.println("The price is updated:"+ref);


    }
}
