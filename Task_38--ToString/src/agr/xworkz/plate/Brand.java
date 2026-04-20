package agr.xworkz.plate;

public class Brand {
    String name;
    double rating;

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public Brand(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }
}
