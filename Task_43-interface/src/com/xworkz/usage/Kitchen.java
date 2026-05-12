package com.xworkz.usage;

import com.xworkz.interfaceClass.MenuCard;

public class Kitchen {

    private MenuCard menuCard;

    public Kitchen(MenuCard menuCard){
        this.menuCard = menuCard;
    }

    public void Prepare(){
        System.out.println("The prepare in kitchen.");

        if(this.menuCard != null){
            String[] items = this.menuCard.getItems(1,"Akasha");

            for (String item:items){
                System.out.println("Items:"+item);
            }
        }
    }
}
