package agr.xworkz.belt;

import javafx.scene.paint.Material;

import java.util.Arrays;

public class Belt {
    double price;
    double GST;
    BeltMaterial material;
    Brand brand;
    int[] count;

    public Belt(double price, double GST, BeltMaterial material, Brand brand, int[] count) {
        this.price = price;
        this.GST = GST;
        this.material = material;
        this.brand = brand;
        this.count = count;
    }

    public void materialInfo(){
        System.out.println("There are different type of material.");
    }

    public void gstInfo(){
        System.out.println("Every product have a GST ID.");
    }

    @Override
    public String toString() {
        return "Belt{" +
                "price=" + price +
                ", GST=" + GST +
                ", material=" + material +
                ", brand=" + brand +
                ", count=" + Arrays.toString(count) +
                '}';
    }
}
