package com.xworkz.curd;

public class City {
    String name;
    int nuOfDistrict;
    District[] districts;

    public City(String name, int nuOfDistrict, District[] districts) {
        this.name = name;
        this.nuOfDistrict = nuOfDistrict;
        this.districts = districts;
    }

    public void cityInfo(){
        System.out.println("City name:"+this.name);
        System.out.println("Number of district in a City:"+this.nuOfDistrict);

        for (District district:this.districts){
            System.out.println("Compare with:"+district);
            if(district != null){
                district.DistrictInfo();
            }
            System.out.println();
        }
    }
}
