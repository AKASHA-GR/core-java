package com.xworkz.box;

public class MetroRunner implements Metro{

    int nunberOfHand;

    public MetroRunner(int nunberOfHand){
        this.nunberOfHand = nunberOfHand;
    }

    public void varun(){
        System.out.println("The Number of Hands the varun Have:"+this.nunberOfHand);
    }

    public void funny(){
        System.out.println("The varun is very funny boy.");
    }


    @Override
    public void engine() {
        System.out.println("The engine is runing using current.");
    }
}
