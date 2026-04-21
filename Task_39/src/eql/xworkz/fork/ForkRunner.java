package eql.xworkz.fork;

public class ForkRunner {
    public static void main(String[] args) {
        Fork fork1 = new Fork(56.3,3.9,150);
        Fork fork2 = new Fork(56.3,3.9,150);

        boolean equals = fork1.equals(fork2);
        System.out.println("Both fork1 and fork2 are same:"+equals);
        boolean equals1 = fork1.price.equals(fork2.price);
        System.out.println(equals1);
    }
}
