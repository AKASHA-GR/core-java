package agr.xworkz.plate;

public class Boule extends Plate{
    String shape;
    double price;

    public Boule(Brand brand, Type type, int weight, String[] color, String material, String shape, double price) {
        super(brand, type, weight, color, material);
        this.shape = shape;
        this.price = price;
    }

    @Override
    public void plateInfo() {
        super.plateInfo();
    }


    @Override
    public void materialInfo() {
        super.materialInfo();
    }

    @Override
    public String toString() {
        return "Boule{" +
                "shape='" + shape + '\'' +
                ", price=" + price +
                '}';
    }
}
