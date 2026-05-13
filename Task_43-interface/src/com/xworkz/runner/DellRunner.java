package com.xworkz.runner;

import com.xworkz.interfaceClass.OS;
import com.xworkz.interfaceClass.WindowsOS;
import com.xworkz.newImplement.LinuxOS;
import com.xworkz.usage.Dell;

public class DellRunner {
    public static void main(String[] args) {

        //old implementation
        OS os = new WindowsOS();

        //new implementation
        OS os1 = new LinuxOS();

        Dell dell = new Dell(os1);

        dell.operate();
    }
}
