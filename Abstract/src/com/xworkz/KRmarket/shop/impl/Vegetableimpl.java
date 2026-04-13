package com.xworkz.KRmarket.shop.impl;

import com.xworkz.KRmarket.shop.Shop;

public class Vegetableimpl implements Shop {


    @Override
    public void business() {
        System.out.println("Selling fresh vegetables");

    }

    @Override
    public void invest() {
        System.out.println("Investing in vegetable shop");
    }
}
