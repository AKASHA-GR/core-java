package eql.xworkz.industry;

public class IndustryRunner {
    public static void main(String[] args) {
        Industry industry1 = new Industry("bag",380,"Bengaluru");
        Industry industry2 = new Industry("bag",380,"Bengaluru");

        boolean equals = industry1.equals(industry2);
        System.out.println(equals+",Both industry1 and industry2 are same.");
    }
}
