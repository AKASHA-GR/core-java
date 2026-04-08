package com.xworkz.runner;

import com.xworkz.creater.Shop;
import com.xworkz.creater.ShopInfo;

public class ShopRunner {
    public static void main(String[] args) {
        Shop shop = new Shop("B.M.T hardware","Bengaluru",1800,220000,50000);
        Shop[] shops = new Shop[2];
        ShopInfo shopInfo = new ShopInfo(shops);
        System.out.println();

        shopInfo.store(shop);
        System.out.println();

        shopInfo.search("Bengaluru");
        System.out.println();

        boolean ref = shopInfo.update("B.M.T hardware",22000);
        System.out.println("The rent is updated:"+ref);
    }
}
