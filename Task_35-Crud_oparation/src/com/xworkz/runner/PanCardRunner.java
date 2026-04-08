package com.xworkz.runner;

import com.xworkz.creater.PanCard;
import com.xworkz.creater.PanCardInfo;

public class PanCardRunner {
    public static void main(String[] args) {
        PanCard panCard = new PanCard("Akasha GR",22,275020853L,"akashmlk2021@gmail.com","02-23-2028");
        PanCard[] panCards = new PanCard[3];
        PanCardInfo panCardInfo = new PanCardInfo(panCards);
        panCardInfo.store(panCard);
        System.out.println();

        panCardInfo.search("Akasha GR");
        System.out.println();

        boolean ref = panCardInfo.update("Akasha GR",9354874847L);
        System.out.println("The mobile number is updated:"+ref);
    }
}
