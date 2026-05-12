package com.xworkz.runner;

import com.xworkz.interfaceClass.OS;
import com.xworkz.interfaceClass.WindowsOS;
import com.xworkz.usage.Dell;

public class DellRunner {
    public static void main(String[] args) {

        OS os = new WindowsOS();

        Dell dell = new Dell(os);

        dell.operate();
    }
}
