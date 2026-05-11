package com.xworkz.work;

public class ToolInfo implements Tool{
    @Override
    public void open() {
        System.out.println("The ChatGpt is open.");
    }

    @Override
    public void close() {
        System.out.println("The ChatGpt is close.");
    }
}
