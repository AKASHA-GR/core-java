package com.xworkz.work;

public interface StockMarket {

    String country = "India";
    String appName = "Grow";
    String investorInIndia = "12–13 crore";

    void stock();
    void candle();

    default void company(){
        System.out.println("The several company have stocks.");
    }

    default void brokerage(){
        System.out.println("The brokerage is per stoke is 20 rupee. ");
    }

    static void marketInfo(){
        System.out.println("The Stock market is depending on the demand and supply  ");
    }
}
