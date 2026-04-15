package agr.xworkz.Slipper;

import java.util.Arrays;

public class Sparx extends Slipper{
    String color;
    String originOfCuntry;

    public Sparx(Type type, Warranty warranty, int[] size, double price, boolean waterProof, String color, String originOfCuntry) {
        super(type, warranty, size, price, waterProof);
        this.color = color;
        this.originOfCuntry = originOfCuntry;
    }

    public void display(){
        priceInfo();
        sizeInfo();
    }

    public String toString(){
        return "Warranty:"+warranty+",Type:"+type+",Size:"+ Arrays.toString(sizes)+",Price:"+price+",WaterProof:"+waterProof+"Color:"+ color +",OriginOfCuntry:"+originOfCuntry;
    }
}
