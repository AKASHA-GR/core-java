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
            System.out.println("The current value is stored in index:"+this.currentIndex);
            if(currentIndex <= currentSize){
                this.shop[currentIndex] = shop;
                shop.displayInfo();
                currentIndex++;
                System.out.println("The next value is stored in index:"+this.currentIndex);
            }
        }else{
            System.out.println("The shop array is null.");
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
        }else{
            System.out.println("The shop array is null.");
        }
    }

    public boolean update(String name,double newRent){
        System.out.println("The update operation is executing in class ShopInfo.");
        boolean found = false;

        if(this.shop != null){
            for(Shop shop2:this.shop){
                System.out.println("compare with:"+shop2);
                if(shop2 != null){
                    if(shop2.name == name){
                        System.out.println("the name is found..");
                        shop2.rent = newRent;
                        System.out.println("the name is updated..");
                        found = true;
                        break;
                    }else{
                        System.out.println("The name is not there....");
                    }
                }
            }
        }else{
            System.out.println("The shop array is null.");
        }

        return found;
    }
}
