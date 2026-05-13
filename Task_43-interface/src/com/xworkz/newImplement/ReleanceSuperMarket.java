package com.xworkz.newImplement;

import com.xworkz.interfaceClass.SuperMarket;

public class ReleanceSuperMarket implements SuperMarket {
    @Override
    public void purchase() {
        System.out.println("The purchase method is executing in Releance SuperMarket.");
    }

    @Override
    public void discount() {
        System.out.println("The discount method is executing in Releance SuperMarket.");
    }
}
