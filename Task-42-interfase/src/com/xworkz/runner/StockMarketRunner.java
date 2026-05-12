package com.xworkz.runner;

import com.xworkz.work.StockMarket;
import com.xworkz.work.StockMarketInfo;

public class StockMarketRunner {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarketInfo();

        stockMarket.brokerage();
        stockMarket.company();
        stockMarket.stock();
        stockMarket.candle();

        StockMarket.marketInfo();

        System.out.println(StockMarket.appName);
        System.out.println(StockMarket.country);
        System.out.println(StockMarket.investorInIndia);
    }
}
