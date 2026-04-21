package eql.xworkz.battery;

public class BatteryRunner {
    public static void main(String[] args) {
        Battery battery1 =new Battery("Duracell",20,true);
        Battery battery2 =new Battery("Duracell",20,true);

        boolean check = battery1.equals(battery2);
        System.out.println("Both battery1 and battery2 are same:"+check);

        boolean check1 = battery1.brand.equals(battery2.brand);
        System.out.println("Both brands are same:"+check1);

        //boolean check2 = battery1.price.equals(battery2.price);
        //System.out.println("Both price sre same:"+check2);
    }
}
