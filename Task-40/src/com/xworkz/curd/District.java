package com.xworkz.curd;

public class District {
    String name;
    Collector collector;

    public District(String name,Collector collector){
        this.name = name;
        this.collector = collector;
    }

    public void DistrictInfo(){
        System.out.println("District name:"+this.name);
        collector.collectorInfo();
        System.out.println();
    }
}
