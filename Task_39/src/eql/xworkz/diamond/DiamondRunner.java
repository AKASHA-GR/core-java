package eql.xworkz.diamond;

public class DiamondRunner {
    public static void main(String[] args) {
        Diamond diamond =new Diamond("London",3.2,2.5);
        Diamond diamond1 =new Diamond("London",3.2,2.5);

        boolean equals = diamond.equals(diamond1);
        System.out.println("Both diamond and diamond1 are same:"+equals);
    }
}
