package com.xworkz.KRmarket.runner;

import com.xworkz.KRmarket.shop.Shop;
import com.xworkz.KRmarket.shop.impl.Vegetableimpl;

public class ShopRunner {
    public static void main(String[] args) {
        Shop veggie=new Vegetableimpl();
        veggie.business();
        veggie.invest();


    }
}
