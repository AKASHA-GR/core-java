package eql.xworkz.trolley;

public class TrolleyRunner {
    public static void main(String[] args) {
        Trolley trolley1 = new Trolley("Safari Pentagon Pro",1869,"Large");
        Trolley trolley2 = new Trolley("Safari Pentagon Pro",1869,"Large");

        boolean check = trolley1.equals(trolley2);
        System.out.println(check);
    }
}
