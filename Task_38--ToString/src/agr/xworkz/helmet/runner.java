package agr.xworkz.helmet;

public class runner {
    public static void main(String[] args) {
        Brand brand = new Brand("ApexHex");
        int[] count = {1,2,3,4,5,6,7,8,9,10};

        Helmet helmet = new Helmet(Type.FULL_FACE,true,"Black",count,brand);
        System.out.println(helmet.toString());
        helmet.protect();
        helmet.typeInfo();
        System.out.println();


        ApexHex apexHex = new ApexHex(Type.FULL_FACE,true,"Black",count,brand,4500,"plastic");
        System.out.println(apexHex);
        apexHex.protect();
        apexHex.typeInfo();
    }
}
