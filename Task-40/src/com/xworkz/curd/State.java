package com.xworkz.curd;

public class State {
    String name;
    int population;
    City[] cities;

    public State(String name, int population, City[] cities) {
        this.name = name;
        this.population = population;
        this.cities = cities;
    }

    public void stateInfo(){
        System.out.println("The State name:"+this.name);
        System.out.println("The number of population in state:"+this.population);

        for (City city:this.cities){
            System.out.println("Compare with:"+city);
            if(city != null){
                city.cityInfo();
            }

        }
    }
}
