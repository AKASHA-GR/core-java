package agr.xworkz.belt;

public class BeltMaterial {
    String material;

    public BeltMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Material{" +
                "material='" + material + '\'' +
                '}';
    }
}
