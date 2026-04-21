package com.xworkz.curd;

public class Country {
    String name;
    President president;
    State[] state;

    public Country(String name, President president, State[] state) {
        this.name = name;
        this.president = president;
        this.state = state;
    }

    public void countryInfo(){
        System.out.println("Country name:"+this.name);
        president.presidentInfo();

        for (State state1:this.state){
            if(state1 != null){
                state1.stateInfo();
            }

            System.out.println();
        }
    }

}
