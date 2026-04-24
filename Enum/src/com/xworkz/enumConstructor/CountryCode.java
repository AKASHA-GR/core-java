package com.xworkz.enumConstructor;

public enum CountryCode {

    IND(91),USA(1),UAE,UK;

    private int code;

    CountryCode(){
        System.out.println("No argument enums reference like UAE and UK");
    }

    CountryCode(int code){
        this.code = code;
        System.out.println("Argument enums reference like IND and USA ");
    }

    public int getCode(){
        return code;
    }

}
