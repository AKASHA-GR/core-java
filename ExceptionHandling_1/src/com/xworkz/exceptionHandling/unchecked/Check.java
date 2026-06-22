package com.xworkz.exceptionHandling.unchecked;

import java.sql.SQLOutput;

public class Check {
    public void say(int a,int b){
        try{
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("ArithemeticException:"+e.getMessage());
        }

        try{
            String text = null;
            int length = text.length();
            System.out.println("Length:"+length);
        }catch (NullPointerException e){
            System.out.println("NullPointerException: " + e.getMessage());
        }

    }
}
