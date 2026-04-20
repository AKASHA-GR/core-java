package eql.xworkz.runner;

import eql.xworkz.wire.Wire;

public class WireRunner {
    public static void main(String[] args) {
        Wire wire1 = new Wire("red",110,22.5);
        Wire wire2= new Wire("red",110,22.5);

        boolean equals = wire1.equals(wire2);
        System.out.println(equals +",Both wire1 and wire2 are same.");
    }
}
