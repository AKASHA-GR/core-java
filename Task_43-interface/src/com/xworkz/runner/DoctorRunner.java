package com.xworkz.runner;

import com.xworkz.interfaceClass.ApolloHospital;
import com.xworkz.interfaceClass.Hospital;
import com.xworkz.usage.Doctor;

public class DoctorRunner {
    public static void main(String[] args) {

        Hospital Hospital = new ApolloHospital();

        Doctor doctor = new Doctor(Hospital);

        doctor.treat();
    }
}
