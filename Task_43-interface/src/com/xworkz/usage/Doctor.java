package com.xworkz.usage;

import com.xworkz.interfaceClass.ApolloHospital;
import com.xworkz.interfaceClass.Hospital;

public class Doctor {

    private Hospital Hospital;

    public Doctor(Hospital Hospital){
        this.Hospital = Hospital;
    }

    public void treat(){
        System.out.println("The treat method is executing in class Doctor.");

        if(this.Hospital != null){

            this.Hospital.treatment();
        }
    }
}
