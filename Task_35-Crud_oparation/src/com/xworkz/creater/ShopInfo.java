package com.xworkz.creater;

public class ShopInfo {
    Shop[] shop;
    int currentIndex = 0;

    public ShopInfo(Shop[] shop){
        this.shop = shop;
    }

    public void store(Shop shop){
        System.out.println("The store operation is executing in class ShopInfo.");

        if(this.shop != null){
            int currentSize = this.shop.length -1;
            if(currentIndex <= currentSize){
                this.shop[currentIndex] = shop;
                shop.displayInfo();
                currentIndex++;
            }
        }
    }

    public void search(String location){
        System.out.println("The search operation is executing in class shopInfo");

        if(this.shop != null){
            for(Shop shop1:this.shop){
                if(shop1 != null){
                    if(shop1.location == location){
                        shop1.displayInfo();
                    }
                }
            }
        }
    }
}
