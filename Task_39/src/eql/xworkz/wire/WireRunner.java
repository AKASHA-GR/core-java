package eql.xworkz.wire;

public class WireRunner {
    public static void main(String[] args) {
        Wire wire1 = new Wire("red",110,22.5);
        Wire wire2= new Wire("red",110,22.5);

        boolean equals = wire1.equals(wire2);
        System.out.println(equals +",Both wire1 and wire2 are same.");
        boolean equals1 = wire1.color.equals(wire2.color);
        System.out.println(equals);

    }
}
