package agr.xworkz.helmet;

public class ApexHex extends Helmet{
    double price;
    String material;

    public ApexHex(Type type, boolean isProtect, String color, int[] count, Brand brand, double price, String material) {
        super(type, isProtect, color, count, brand);
        this.price = price;
        this.material = material;
    }

    @Override
    public void protect() {
        super.protect();
    }

    @Override
    public void typeInfo() {
        super.typeInfo();
    }

    @Override
    public String toString() {
        return "Price:"+price+",Material:"+material;
    }
}
