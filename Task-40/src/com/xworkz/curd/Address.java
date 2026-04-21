package com.xworkz.curd;

public class Address {
    int number;
    int pinCode;
    State state;

    public Address(int number, int pinCode, State state) {
        this.number = number;
        this.pinCode = pinCode;
        this.state = state;
    }

    public void addressInfo(){
        System.out.println("Address number:"+this.number);
        System.out.println("Address pinCode:"+this.pinCode);
        state.stateInfo();
    }
}
