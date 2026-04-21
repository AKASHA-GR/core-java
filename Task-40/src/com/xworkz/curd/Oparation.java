package com.xworkz.curd;

import java.sql.SQLOutput;

public class Oparation {
    Country[] countries;
    State[] states;
    City[] cities;
    int currentIndex = 0;


    public Oparation(Country[] countries){
        this.countries = countries;
    }
    public Oparation(State[] states){
        this.states = states;
    }
    public Oparation(City[] cities){
        this.cities = cities;
    }



    public void save(Country country){
        if(this.countries != null){
            System.out.println("The countries array is not null.");
            if(country != null){
                System.out.println("The country is not null");

                int indexSize = this.countries.length -1;
                System.out.println("current value is stored in index:"+this.currentIndex);
                if(currentIndex <= indexSize){
                    this.countries[currentIndex] = country;
                    country.countryInfo();
                    currentIndex++;
                    System.out.println("Next value is stored in index:"+this.currentIndex);
                }else {
                    System.out.println("Array is full.");
                }
            }

        }else{
            System.out.println("The countries array is null.");
        }
    }


    public boolean search(String name){
        if(this.countries != null){
            System.out.println("The countries array is not null.");
            if(name != null){
                System.out.println("The name is not null");

                for (Country country:this.countries){
                    if(country != null) {
                        if (country.name == name) {
                            country.countryInfo();
                            return true;
                        } else {
                            System.out.println("the country is not there.");
                        }
                    }
                }
            }else{
                System.out.println("The countries array is null.");
            }
        }
        return false;
    }



    public boolean searchByState(String stateName){
        System.out.println("The search oparation is done using stateName.");
        if(this.states != null){
            System.out.println("The states array is not null.");
            if(stateName != null){
                System.out.println("The stateNmme is not null");

                for (State state:this.states){
                    if(state != null) {
                        if (state.name == stateName) {
                            state.stateInfo();
                            return true;
                        } else {
                            System.out.println("the state is not there.");
                        }
                    }
                }
            }else{
                System.out.println("The states array is null.");
            }
        }
        return false;
    }

    public boolean searchCityByState(String stateName){
        System.out.println("The search operation is down by StateName.");

        if(this.cities != null && this.states != null && stateName != null){
            System.out.println("The cities array and statename is not null.");

            for (State state:this.states){
                if(state != null) {
                    if (state.name == stateName) {
                        for (City city:this.cities){
                            if(city != null) {
                                city.cityInfo();
                            }else {
                                System.out.println("The city is not there.");
                            }
                        }

                        return true;
                    } else {
                        System.out.println("the state is not there.");
                    }
                }
            }

        }else {
            System.out.println("The Array or name is null.");
        }
        return false;
    }
}
