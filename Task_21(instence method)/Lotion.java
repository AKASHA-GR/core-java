class Lotion {

    String name;
    String brand;
    String fragrance;
    String skinType;
    String category;
    String ingredient;
    String manufacturer;
    String country;
    String packagingType;
    String color;
    int manufactureYear;
    int expiryYear;
    int quantityAvailable;
    int popularityRank;
    int dermatologyRating;
    double volume;
    double price;
    double weight;
    double phLevel;
    double discount;

    Lotion(String name, String brand, String fragrance, String skinType, String category,
           String ingredient, String manufacturer, String country, String packagingType, String color,
           int manufactureYear, int expiryYear, int quantityAvailable, int popularityRank, int dermatologyRating,
           double volume, double price, double weight, double phLevel, double discount) {

        this.name = name;
        this.brand = brand;
        this.fragrance = fragrance;
        this.skinType = skinType;
        this.category = category;
        this.ingredient = ingredient;
        this.manufacturer = manufacturer;
        this.country = country;
        this.packagingType = packagingType;
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.expiryYear = expiryYear;
        this.quantityAvailable = quantityAvailable;
        this.popularityRank = popularityRank;
        this.dermatologyRating = dermatologyRating;
        this.volume = volume;
        this.price = price;
        this.weight = weight;
        this.phLevel = phLevel;
        this.discount = discount;
    }

    void display() {
        System.out.println("Lotion Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Category: " + category);
        System.out.println("Main Ingredient: " + ingredient);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Color: " + color);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Expiry Year: " + expiryYear);
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("Popularity Rank: " + popularityRank);
        System.out.println("Dermatology Rating: " + dermatologyRating);
        System.out.println("Volume (ml): " + volume);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("pH Level: " + phLevel);
        System.out.println("Discount (%): " + discount);
    }
}


