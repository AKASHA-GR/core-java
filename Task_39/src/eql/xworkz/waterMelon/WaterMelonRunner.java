package eql.xworkz.waterMelon;

public class WaterMelonRunner {
    public static void main(String[] args) {
        WaterMelon waterMelon1 = new WaterMelon(2,30,false);
        WaterMelon waterMelon2 = new WaterMelon(2,30,false);

        boolean equals = waterMelon1.equals(waterMelon2);
        System.out.println(equals+",both watermelon1 and watermelon2 are same.");
    }
}
