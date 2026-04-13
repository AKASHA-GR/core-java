package com.xworkz09.runner;

import com.xworkz09.validation.Google;
import com.xworkz09.validation.Validation;

public class ValidationRunner {
    public static void main(String[] args) {
        Validation ref = new Google();
        ref.password();
        ref.submit();
        ref.userName();
    }
}
