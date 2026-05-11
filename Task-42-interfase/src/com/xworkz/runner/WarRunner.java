package com.xworkz.runner;

import com.xworkz.work.War;
import com.xworkz.work.WarInfo;

public class WarRunner {
    public static void main(String[] args) {
        War war = new WarInfo();

        System.out.println(War.country);
        System.out.println(War.year);
        System.out.println(War.active);

        war.defence();
        war.attack();

        war.attack();
        war.loss();

        War.result();
    }
}
