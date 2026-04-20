package agr.xworkz.plate;


import java.util.Arrays;

public class Plate {
    Brand brand;
    Type type;
    int weight;
    String[] color;
    String material;

    public Plate(Brand brand, Type type, int weight, String[] color, String material) {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.color = color;
        this.material = material;
    }

    public void plateInfo(){
        System.out.println("The plate information is displayed.....");
    }

    public void materialInfo(){
        System.out.println("The plate material information is displayed.....");
    }

    @Override
    public String toString() {
        return "Plate{" +
                "brand=" + brand +
                ", type=" + type +
                ", weight=" + weight +
                ", color='" + Arrays.toString(color) + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
