class Conditioner {

    String brand;
    String variant;
    String fragrance;
    String hairType;
    String ingredient1;
    String ingredient2;
    String ingredient3;
    String color;
    String manufacturer;
    String country;
    int quantityAvailable;
    int shelfLifeMonths;
    int rating;
    int productionYear;
    int warrantyMonths;
    double volume;
    double price;
    double phLevel;
    double discount;
    double weight;

    Conditioner(String brand, String variant, String fragrance, String hairType,
                String ingredient1, String ingredient2, String ingredient3,
                String color, String manufacturer, String country,
                int quantityAvailable, int shelfLifeMonths, int rating,
                int productionYear, int warrantyMonths,
                double volume, double price, double phLevel,
                double discount, double weight) {

        this.brand = brand;
        this.variant = variant;
        this.fragrance = fragrance;
        this.hairType = hairType;
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
        this.color = color;
        this.manufacturer = manufacturer;
        this.country = country;
        this.quantityAvailable = quantityAvailable;
        this.shelfLifeMonths = shelfLifeMonths;
        this.rating = rating;
        this.productionYear = productionYear;
        this.warrantyMonths = warrantyMonths;
        this.volume = volume;
        this.price = price;
        this.phLevel = phLevel;
        this.discount = discount;
        this.weight = weight;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Variant: " + variant);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Hair Type: " + hairType);
        System.out.println("Ingredient1: " + ingredient1);
        System.out.println("Ingredient2: " + ingredient2);
        System.out.println("Ingredient3: " + ingredient3);
        System.out.println("Color: " + color);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("Shelf Life (Months): " + shelfLifeMonths);
        System.out.println("Rating: " + rating);
        System.out.println("Production Year: " + productionYear);
        System.out.println("Warranty Months: " + warrantyMonths);
        System.out.println("Volume: " + volume);
        System.out.println("Price: " + price);
        System.out.println("pH Level: " + phLevel);
        System.out.println("Discount: " + discount);
        System.out.println("Weight: " + weight);
    }
}