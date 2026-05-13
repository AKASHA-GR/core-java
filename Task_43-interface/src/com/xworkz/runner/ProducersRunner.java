package com.xworkz.runner;

import com.xworkz.interfaceClass.SuperMarket;
import com.xworkz.newImplement.ReleanceSuperMarket;
import com.xworkz.usage.Producers;

public class ProducersRunner {
    public static void main(String[] args) {


        //old implementation
        SuperMarket superMarket = new SuperMarket.DMartSuperMarket();

        //new implementation
        SuperMarket superMarket1 = new ReleanceSuperMarket();

        Producers producers = new Producers(superMarket1);

        producers.sellProduct();
    }
}
