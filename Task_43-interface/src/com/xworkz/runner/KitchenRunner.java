package com.xworkz.runner;

import com.xworkz.interfaceClass.BindedMenuCard;
import com.xworkz.interfaceClass.MenuCard;
import com.xworkz.usage.Kitchen;

public class KitchenRunner {
    public static void main(String[] args) {
        MenuCard menuCard = new BindedMenuCard();

        Kitchen kitchen = new Kitchen(menuCard);

        kitchen.Prepare();
    }
}
