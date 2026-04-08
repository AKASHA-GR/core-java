package com.xworkz.runner;

import com.xworkz.creater.Medical;
import com.xworkz.creater.MedicalInfo;

public class MedicalRunner {
    public static void main(String[] args) {
        Medical medical = new Medical("St. John’s Medical College",340000,"Marathahalli",4.0,80);
        Medical[] medicals = new Medical[4];
        MedicalInfo medicalInfo = new MedicalInfo(medicals);
        medicalInfo.store(medical);
        System.out.println();

        medicalInfo.search("St. John’s Medical College");
        System.out.println();

        boolean ref = medicalInfo.update("St. John’s Medical College",120);
        System.out.println("The college seats is updated:"+ref);
    }
}
