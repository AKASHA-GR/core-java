package com.xworkz.interfaceClass;

public class BindedMenuCard implements MenuCard{
    @Override
    public String[] getItems(int tableNo, String customerName) {

        System.out.println("tableNo"+tableNo);
        System.out.println("customerName"+customerName);

        return new String[]{"Gobi","GobiRice","Pizza","Roti","Dal"};
    }
}
