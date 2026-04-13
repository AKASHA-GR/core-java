package com.xworkz03.Runner;

import com.xworkz03.software.Software;
import com.xworkz03.software.SoftwareImpl;

public class SoftwareRunner {
    public static void main(String[] args) {
        Software ref = new SoftwareImpl();
        ref.frontend();
        ref.backend();
        ref.validation();
    }
}
