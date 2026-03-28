/*Declare below classes, then declare least 20 instance variables in every class . One constrcutor in each class,then instance method to display all the variables. Then in the runner create least 10 instances and invoke the method to display Google,
WallPaper,
Pepper,
Paper,
Garlic,
Stand,
Map,
Toxic,
PVR,
Trophy,
DumbBell,
Diabetes,
Brain,
Shampoo,
Conditioner,
Organ,
Cell,
Office,
Lotion,
Organizer,
Education
*/

class Shampoo {

    String name;
    String brand;
    String type;
    String fragrance;
    String color;
    String hairType;
    String country;
    String manufacturer;
    String ingredients;
    String packagingType;
    int manufacturingYear;
    int quantityAvailable;
    int warrantyMonths;
    int popularityRank;
    int rating;
    double volume;
    double price;
    double weight;
    double phLevel;
    double discountPercentage;

    Shampoo(String name, String brand, String type, String fragrance, String color,
            String hairType, String country, String manufacturer, String ingredients, String packagingType,
            int manufacturingYear, int quantityAvailable, int warrantyMonths, int popularityRank, int rating,
            double volume, double price, double weight, double phLevel, double discountPercentage) {

        this.name = name;
        this.brand = brand;
        this.type = type;
        this.fragrance = fragrance;
        this.color = color;
        this.hairType = hairType;
        this.country = country;
        this.manufacturer = manufacturer;
        this.ingredients = ingredients;
        this.packagingType = packagingType;
        this.manufacturingYear = manufacturingYear;
        this.quantityAvailable = quantityAvailable;
        this.warrantyMonths = warrantyMonths;
        this.popularityRank = popularityRank;
        this.rating = rating;
        this.volume = volume;
        this.price = price;
        this.weight = weight;
        this.phLevel = phLevel;
        this.discountPercentage = discountPercentage;
    }

    void display() {
        System.out.println("Shampoo Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Color: " + color);
        System.out.println("Hair Type: " + hairType);
        System.out.println("Country: " + country);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("Warranty Months: " + warrantyMonths);
        System.out.println("Popularity Rank: " + popularityRank);
        System.out.println("Rating: " + rating);
        System.out.println("Volume: " + volume);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("pH Level: " + phLevel);
        System.out.println("Discount Percentage: " + discountPercentage);
    }
}


