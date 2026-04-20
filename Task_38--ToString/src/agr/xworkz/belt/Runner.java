package agr.xworkz.belt;


public class Runner {
    public static void main(String[] args) {
        BeltMaterial ob = new BeltMaterial("Nylon");
        int[] count = {1,2,3,4,5,6,7,8,9,10,20};

        Belt belt = new Belt(799,79,ob,Brand.PUMA,count);
        belt.materialInfo();
        belt.gstInfo();
        System.out.println(belt);


        BeltInfo beltInfo = new BeltInfo(799,79,ob,Brand.PUMA,count,12.5,4.1);
        beltInfo.materialInfo();
        beltInfo.gstInfo();
        System.out.println(beltInfo);
    }
}
