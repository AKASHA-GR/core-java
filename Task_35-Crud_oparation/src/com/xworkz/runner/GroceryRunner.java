package com.xworkz.runner;

import com.xworkz.creater.Grocery;
import com.xworkz.creater.GroceryInfo;


public class GroceryRunner {
    public static void main(String[] args) {
        Grocery grocery = new Grocery("Reliance Mart",46,"BTM",78,true);
        Grocery[] groceries = new Grocery[4];
        GroceryInfo groceryInfo = new GroceryInfo(groceries);
        groceryInfo.store(grocery);
        System.out.println();

        groceryInfo.search("BTM");
        System.out.println();

        boolean ref = groceryInfo.update("Reliance Mart",124);
        System.out.println("The number of workers is updated:"+ref);

    }
}
