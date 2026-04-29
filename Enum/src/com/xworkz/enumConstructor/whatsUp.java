package com.xworkz.enumConstructor;

public class whatsUp extends Application {
    public static void main(String[] args) {

    }

    @Override
    public void pause() {
        System.out.println("This method is implemented on subclass.");
    }

    @Override
    public void run() {
        super.run();
    }
}
