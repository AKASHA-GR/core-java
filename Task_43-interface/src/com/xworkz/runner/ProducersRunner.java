package com.xworkz.runner;

import com.xworkz.interfaceClass.SuperMarket;
import com.xworkz.usage.Producers;

public class ProducersRunner {
    public static void main(String[] args) {

        SuperMarket superMarket = new SuperMarket.DMartSuperMarket();

        Producers producers = new Producers(superMarket);

        producers.sellProduct();
    }
}
