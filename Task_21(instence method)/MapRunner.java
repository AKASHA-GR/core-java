class MapRunner {
    public static void main(String[] args) {

        Map map1 = new Map("World Atlas","Political","World","Oxford","English","1:5000000","Paper","Multicolor","UK",40,30,0.5,899,5000000,120,2022,50,2,8,true,true);
        map1.display();
        System.out.println();

        Map map2 = new Map("India Map","Geographical","India","Survey of India","English","1:2500000","Paper","Color","India",35,25,0.4,499,2500000,1,2021,100,1,7,true,true);
        map2.display();
        System.out.println();

        Map map3 = new Map("Karnataka Road Map","Road","Karnataka","State Press","English","1:1000000","Paper","Color","India",30,20,0.3,299,1000000,1,2023,80,1,7,false,true);
        map3.display();
        System.out.println();

        Map map4 = new Map("USA Atlas","Political","USA","National Geographic","English","1:4000000","Paper","Multicolor","USA",42,32,0.6,1099,4000000,150,2020,40,3,9,true,false);
        map4.display();
        System.out.println();

        Map map5 = new Map("Europe Travel Map","Tourist","Europe","Lonely Planet","English","1:3000000","Paper","Color","Australia",38,28,0.45,799,3000000,50,2022,60,2,8,true,true);
        map5.display();
        System.out.println();

        Map map6 = new Map("Asia Physical Map","Physical","Asia","Oxford","English","1:6000000","Paper","Multicolor","UK",45,35,0.7,999,6000000,1,2021,30,2,9,true,false);
        map6.display();
        System.out.println();

        Map map7 = new Map("City Metro Map","Transport","Bangalore","Metro Corp","English","1:50000","Laminated Sheet","Color","India",25,18,0.2,199,50000,1,2024,200,1,6,true,true);
        map7.display();
        System.out.println();

        Map map8 = new Map("Africa Political Map","Political","Africa","Oxford","English","1:7000000","Paper","Color","UK",43,33,0.65,950,7000000,1,2022,35,2,8,true,false);
        map8.display();
        System.out.println();

        Map map9 = new Map("Australia Road Map","Road","Australia","GeoPress","English","1:1500000","Paper","Color","Australia",32,22,0.35,450,1500000,1,2023,75,1,7,false,true);
        map9.display();
        System.out.println();

        Map map10 = new Map("Antarctica Research Map","Scientific","Antarctica","Research Org","English","1:8000000","Special Sheet","Blue White","USA",50,40,0.8,1500,8000000,10,2019,15,5,10,true,false);
        map10.display();
        System.out.println();
    }
}