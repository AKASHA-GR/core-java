package com.xworkz03.software;

public class SoftwareImpl implements Software{

    @Override
    public void frontend() {
        System.out.println("The frontend is down by HTML,CSS,JS,ReactJS.....");
    }

    @Override
    public void backend() {
        System.out.println("The backend is down by Java,SpringBoot........");
    }
}
