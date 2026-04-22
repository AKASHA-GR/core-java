package com.xworkz.curd;

import java.sql.SQLOutput;

public class Oparation {
    Country[] countries;
    State[] states;
    City[] cities;
    Collector[] collectors;
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
    public Oparation(Collector[] collectors){
        this.collectors = collectors;
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


    public int noOfDistrictByCityName(String cityName){
        System.out.println("The fined number of district by City name.");
        int count = 0;

        if(this.cities != null && cityName != null){
            System.out.println("The cities array is not null.");

            for (City city:this.cities){
                if (city != null){
                    if(city.name == cityName){
                        return city.nuOfDistrict;
                    }
                }
            }

        }else {
            System.out.println("The cities array or cityname is null.");
        }
        return count;
    }


    public boolean countryByCollectorName(String collectorName){
        if(this.collectors != null && this.countries != null && collectorName != null){
            System.out.println("The collectore array and collectorName is not null.");

            for (Collector collector:this.collectors){
                System.out.println("compareing");
                if(collector != null){
                    System.out.println("not null");
                    if(collector.name == collectorName){
                        for(Country country:this.countries){
                            country.countryInfo();
                        }

                    }else{
                        System.out.println("The collector name is not there.");
                    }

                    return true;
                }
            }

        }else {
            System.out.println("The collectore array and collectorName is null.");
        }
        return false;

    }
}
