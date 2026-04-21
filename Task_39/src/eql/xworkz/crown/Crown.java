package eql.xworkz.crown;

public class Crown {
    String material;
    double weight;
    double height;

    public Crown(String material,double weight,double height) {
        this.material = material;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Crown{" +
                "material='" + material + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
