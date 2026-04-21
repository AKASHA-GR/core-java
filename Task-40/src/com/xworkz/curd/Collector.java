package com.xworkz.curd;

public class Collector {
    String name;
    int batchNo;

    public Collector(String name,int batchNo){
        this.name = name;
        this.batchNo = batchNo;
    }

    public void collectorInfo(){
        System.out.println("The collector name:"+this.name);
        System.out.println("The collector bathNo:"+this.batchNo);
    }
}
