package com.xworkz.work;

public class StockMarketInfo implements StockMarket{
    @Override
    public void stock() {
        System.out.println("The Store are added through the IPO's.");
    }

    @Override
    public void candle() {
        System.out.println("The candles decide the maket loss or gain.");
    }
}
