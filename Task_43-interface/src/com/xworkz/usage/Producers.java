package com.xworkz.usage;

import com.xworkz.interfaceClass.SuperMarket;

public class Producers {

    private SuperMarket superMarket;

    public Producers(SuperMarket superMarket){
        this.superMarket = superMarket;
    }

    public void sellProduct(){
        System.out.println("The sellProduct method is in Producers class.");

        if(this.superMarket != null){

            this.superMarket.purchase();
            this.superMarket.discount();
        }
    }

}
