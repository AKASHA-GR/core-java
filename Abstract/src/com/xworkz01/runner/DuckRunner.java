package com.xworkz01.runner;

import com.xworkz01.duck.Duck;
import com.xworkz01.duck.impl.DuckInfo;

public class DuckRunner {
    public static void main(String[] args) {
        Duck ref = new DuckInfo();
        ref.fly();
        ref.quack();
        ref.quack();
    }


}
