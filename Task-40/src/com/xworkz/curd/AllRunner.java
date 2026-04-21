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
        districts[1] = new District("Davanagere",collector);
        districts[2] = new District("Ballary",collector);
        City city = new City("Karnataka",31,districts);
        city.cityInfo();
        System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");


        City[] cities1 = new City[3];
        cities1[0] = new City("Karnataka",31,districts);
        cities1[1] = new City("Andra",31,districts);
        State state = new State("Karnataka",70000000,cities1);
        state.stateInfo();
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");



        Address address = new Address(1,577535,state);
        address.addressInfo();
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

        President president = new President(" Smt. Droupadi Murmu.",65,address);
        president.presidentInfo();
        President president1 = new President(" Ram Chandra Paudel.",74,address);
        System.out.println("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");





       //oparation


        State[] state1 = new State[1];
        state1[0] = new State("Karnataka",7000000,cities1);
        Country country = new Country("India", president1,state1);
        //Country country1 = new Country("America", president1,state1);
        country.countryInfo();
        System.out.println("1111111111111111111111111111111111111111111111111111111111111111111111111111");



        Country[] countries = new Country[10];
        Oparation oparation = new Oparation(countries);
        oparation.save(country);
        //oparation.save(country1);
        System.out.println("222222222222222222222222222222222222222222222222222222222222222222222");
        System.out.println();


        boolean check = oparation.search("India");
        System.out.println("The country is found:"+check);
        System.out.println("33333333333333333333333333333333333333333333333333333333333333333333333");
        System.out.println();

        Oparation oparation1 = new Oparation(state1);
        boolean check1 = oparation1.searchByState("Karnataka");
        System.out.println("The state is found:"+check1);
        System.out.println("4444444444444444444444444444444444444444444444444444444444444444444444444");
        System.out.println();


        //Oparation operation2 = new Oparation(state1);
        boolean check2 = oparation1.searchCityByState("Karnataka");
        System.out.println("The city is found:"+ check2);
        System.out.println("555555555555555555555555555555555555555555555555555555555555555555555555555");
        System.out.println();






    }
}
