package com.xworkz.curd;

public class AllRunner {
    public static void main(String[] args) {
        
        Collector collector = new Collector("Akasha GR",201);
        collector.collectorInfo();
        System.out.println();

        District district = new District("Chitradurga",collector);
        district.DistrictInfo();
        System.out.println();


        District[] districts = new District[3];
        districts[0] = new District("Chitradurga",collector);
        districts[1] = new District("Chitradurga",collector);

        City city = new City("Karnataka",31,districts);
        city.cityInfo();
        System.out.println();


        City[] cities1 = new City[3];
        cities1[0] = new City("Karnataka",31,districts);
        cities1[1] = new City("Karnataka",31,districts);
        State state = new State("Karnataka",70000000,cities1);
        state.stateInfo();
        System.out.println();


        Address address = new Address(1,577535,state);
        address.addressInfo();
        System.out.println("=======================================================");

        President president = new President(" Smt. Droupadi Murmu.",65,address);
        president.presidentInfo();
        System.out.println();

        State[] state1 = new State[1];
        state1[0] = new State("Karnataka",7000000,cities1);
        Country country = new Country("India",president,state1);
        country.countryInfo();
        System.out.println("=========================================");



    }
}
