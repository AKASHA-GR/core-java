package com.xworkz.exceptionHandling.checked;

import java.io.IOException;

public class FileRunner {
    public static void main(String[] args) {
        File file = new File();
        try {
            file.readFile("test.txt");
        } catch (IOException e) {
            System.out.println("Checked Exception caught: " + e.getMessage());
        }
    }
}
