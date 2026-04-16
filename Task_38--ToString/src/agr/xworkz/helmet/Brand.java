package agr.xworkz.helmet;

public class Brand {
    String name;

    public Brand(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brand Name:"+name;
    }
}
