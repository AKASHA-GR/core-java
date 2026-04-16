package agr.xworkz.slipper;

public class SparxRunner {
    public static void main(String[] args) {
        Type type = new Type("Rubber");
        int[] sizes = {2,3,4,5,6,7,8,9,10};
        Slipper slipper = new Slipper(type,Warranty.ONE,sizes,2450.0,true);
        System.out.println(slipper.toString());
        slipper.sizeInfo();
        slipper.priceInfo();
        System.out.println();

        Slipper slipper1 = new Sparx(type,Warranty.ONE,sizes,2450.0,true,"Red","India");
        System.out.println(slipper1.toString());
        slipper1.sizeInfo();
        slipper1.priceInfo();


    }
}
