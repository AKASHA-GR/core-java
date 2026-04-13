package com.xworkz08.runner;

import com.xworkz08.Phone.Phone;
import com.xworkz08.Phone.Realme;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone ref = new Realme();
        ref.processor();
        ref.Storage();
        ref.screen();
    }
}
