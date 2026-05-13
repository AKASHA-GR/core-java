package com.xworkz.runner;

import com.xworkz.interfaceClass.ApolloHospital;
import com.xworkz.interfaceClass.Hospital;
import com.xworkz.newImplement.NarayannaHospital;
import com.xworkz.usage.Doctor;

public class DoctorRunner {
    public static void main(String[] args) {

        //old implementation
        Hospital Hospital = new ApolloHospital();

        //old implementation
        Hospital Hospital1 = new NarayannaHospital();

        Doctor doctor = new Doctor(Hospital1);

        doctor.treat();
    }
}
