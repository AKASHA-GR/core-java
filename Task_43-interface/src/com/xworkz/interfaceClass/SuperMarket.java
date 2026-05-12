package com.xworkz.interfaceClass;

public interface SuperMarket {

    void purchase();

    void discount();

    class DMartSuperMarket implements SuperMarket {
        @Override
        public void purchase() {
            System.out.println("The Purchase method is override from SuperMarket.");
        }

        @Override
        public void discount() {
            System.out.println("The 10% discount for every product.");
        }
    }
}
