package com.xworkz.runner;

import com.xworkz.interfaceClass.BindedMenuCard;
import com.xworkz.interfaceClass.MenuCard;
import com.xworkz.newImplement.BookMenuCard;
import com.xworkz.usage.Kitchen;

public class KitchenRunner {
    public static void main(String[] args) {

        //old implementation
        MenuCard menuCard = new BindedMenuCard();

        //old implementation
        MenuCard menuCard1 = new BookMenuCard();

        Kitchen kitchen = new Kitchen(menuCard1);

        kitchen.Prepare();
    }
}
