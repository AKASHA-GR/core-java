package com.xworkz.curd;



public class CountryStore {
    Country[] countries;
    int currentIndex = 0;


    public CountryStore(Country[] countries) {
        this.countries = countries;
    }


    public void save(Country country) {
        if (this.countries != null) {
            System.out.println("The countries array is not null.");
            if (country != null) {
                System.out.println("The country is not null");

                int indexSize = this.countries.length - 1;
                System.out.println("current value is stored in index:" + this.currentIndex);
                if (currentIndex <= indexSize) {
                    this.countries[currentIndex] = country;
                    currentIndex++;
                    System.out.println("Next value is stored in index:" + this.currentIndex);
                } else {
                    System.out.println("Array is full.");
                }
            }

        } else {
            System.out.println("The countries array is null.");
        }
    }


    public Country findByName(String name) {
        if (this.countries != null) {
            System.out.println("The countries array is not null.");
            if (name != null) {
                System.out.println("The name is not null");

                for (Country country : this.countries) {
                    if (country != null) {
                        if (country.name.equals(name)) {
                            return country;
                        } else {
                            System.out.println("the country is not there.");
                        }
                    }
                }
            } else {
                System.out.println("The  name is null.");
            }
        }else {
            System.out.println("The countries array is null.");
        }
        return null;
    }


    public State findStateByStateName(String stateName) {
        System.out.println("The search operation is done using stateName.");

            if (stateName != null) {
                System.out.println("The stateName is not null");

                for (Country country:this.countries) {
                    if(country != null) {
                        if(country.state != null) {
                            for (State state : country.state) {
                                if (state != null) {
                                    if (state.name.equals(stateName)) {
                                        return state;
                                    } else {
                                        System.out.println("the state is not there.");
                                    }
                                }else {
                                    System.out.println("The state is null.");
                                }
                            }
                        }
                    }else {
                        System.out.println("The county is not there.");
                    }
                }
            } else {
                System.out.println("The  State name is null.");
            }
        return null;
    }



    public City[] findAllCityByStateName(String stateName){
        System.out.println("The finding all cities by StateName.");

            for (Country country:this.countries) {
                if(country != null) {
                    if(country.state != null) {
                        for (State state : country.state) {
                            if (state != null) {
                                if (state.name.equals(stateName)) {
                                    for (City city : state.cities) {
                                        if (city != null) {
                                            return state.cities;
                                        } else {
                                            System.out.println("The city is not there.");
                                        }
                                    }
                                } else {
                                    System.out.println("the state is not there.");
                                }
                            }else {
                                System.out.println("The state is not there.");
                            }
                        }
                    }
                }else {
                    System.out.println("The country is null.");
                }
            }
        return null;
    }


    public int noOfDistrictByCityName(String cityName) {
        System.out.println("The fined number of district by City name.");
        int count = 0;

        if (cityName != null) {
            System.out.println("The cityname is not null.");

            for(Country country:this.countries) {
                if(country != null) {
                    if(country.state != null) {
                        for(State state:country.state) {
                            if(state != null) {
                                if(state.cities != null) {
                                    for (City city : state.cities) {
                                        if (city != null) {
                                            if (city.name.equals(cityName)) {
                                                return city.nuOfDistrict;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        } else {
            System.out.println("The cities array or cityname is null.");
        }
        return count;
    }


    public boolean countryByCollectorName(String collectorName) {
        if (this.countries != null) {
            for(Country country:this.countries){
                if(country!=null){
                    if(country.state!=null){
                        for(State state:country.state){
                            if(state!=null){
                                if(state.cities!=null){
                                    for(City city:state.cities){
                                        if(city!=null){
                                            if(city.districts!=null){

                                                for(District district:city.districts){

                                                    if(district!=null){
                                                        if(district.collector!=null){

                                                            if(collectorName.equals(district.collector.name)){
                                                                System.out.println("collector found!!! in district "+district.name);
                                                                System.out.println(country.name);
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        } else {
            System.out.println("Countries is empty in last method");
        }
        System.out.println("collector not found");
return  false;
    }
}