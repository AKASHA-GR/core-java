package agr.xworkz.belt;

import javafx.scene.paint.Material;

public class BeltInfo extends Belt{
    double length;
    double width;

    public BeltInfo(double price, double GST, BeltMaterial material, Brand brand, int[] count, double length, double width) {
        super(price, GST, material, brand, count);
        this.length = length;
        this.width = width;
    }

    @Override
    public void gstInfo() {
        super.gstInfo();
    }

    @Override
    public void materialInfo() {
        super.materialInfo();
    }

    @Override
    public String toString() {
        return "BeltInfo{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
