package com.xworkz.handling;
public class CheckedExceptionDemo {

    public static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Handled Checked Exception: " + e.getMessage());
        }
    }
}
