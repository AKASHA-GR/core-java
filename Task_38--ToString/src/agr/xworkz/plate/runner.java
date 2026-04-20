package agr.xworkz.plate;

public class runner {
    public static void main(String[] args) {
        Brand brand = new Brand("Corelle",4.7);
        String[] color ={"white","red","green","yellow"};

        Plate plate = new Plate(brand,Type.DINNER_PLATE,250,color,"Steel");
        plate.materialInfo();
        plate.plateInfo();
        System.out.println(plate);
        System.out.println();

        Boule boule = new Boule(brand,Type.DINNER_PLATE,250,color,"Steel","cylinder",660);
        boule.materialInfo();
        boule.plateInfo();
        System.out.println(boule);

    }
}
