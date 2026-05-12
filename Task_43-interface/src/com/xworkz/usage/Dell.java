package com.xworkz.usage;

import com.xworkz.interfaceClass.OS;

public class Dell {

    private OS os;

    public Dell(OS os){
        this.os = os;
    }

    public void operate(){
        System.out.println("The operate method is in Dell class.");

        if(this.os != null){
            System.out.println("The os is not null.");

            this.os.start();
            this.os.boot();
            this.os.start();
        }
    }
}
