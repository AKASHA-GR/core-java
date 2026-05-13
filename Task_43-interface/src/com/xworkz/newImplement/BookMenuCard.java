package com.xworkz.newImplement;

import com.xworkz.interfaceClass.MenuCard;

public class BookMenuCard implements MenuCard {
    @Override
    public String[] getItems(int tableNo, String customerName) {
        System.out.println("tableNo"+tableNo);
        System.out.println("customerName"+customerName);

        return new String[]{"Vada","Egg rice","burger","roti","paneer"};
    }
}
