package com.xworkz.usage;

import com.xworkz.interfaceClass.Remote;

public class User {

    private Remote remote;

    public User(Remote remote){
        this.remote = remote;
    }

    public void work(){
        System.out.println("The work method is running in class User.");

        if(this.remote != null){

            this.remote.turnOn();
            this.remote.turnOff();
        }
    }

}
