class Trophy {

    String name;
    String material;
    String color;
    String shape;
    String category;
    String eventName;
    String organization;
    String country;
    String engravingText;
    String manufacturer;
    int year;
    int quantityAvailable;
    int warrantyYears;
    int popularityRank;
    int durabilityRating;
    double height;
    double width;
    double weight;
    double price;
    double baseDiameter;

    Trophy(String name, String material, String color, String shape, String category,
           String eventName, String organization, String country, String engravingText, String manufacturer,
           int year, int quantityAvailable, int warrantyYears, int popularityRank, int durabilityRating,
           double height, double width, double weight, double price, double baseDiameter) {

        this.name = name;
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.category = category;
        this.eventName = eventName;
        this.organization = organization;
        this.country = country;
        this.engravingText = engravingText;
        this.manufacturer = manufacturer;
        this.year = year;
        this.quantityAvailable = quantityAvailable;
        this.warrantyYears = warrantyYears;
        this.popularityRank = popularityRank;
        this.durabilityRating = durabilityRating;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.price = price;
        this.baseDiameter = baseDiameter;
    }

    void display() {
        System.out.println("Trophy Name: " + name);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Category: " + category);
        System.out.println("Event name: " + eventName);
        System.out.println("Organization name: " + organization);
        System.out.println("Country name: " + country);
        System.out.println("Engraving Text :" + engravingText);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year: " + year);
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Popularity Rank: " + popularityRank);
        System.out.println("Durability Rating: " + durabilityRating);
        System.out.println("Height: " + height);
        System.out.println("width: " + width);
        System.out.println("weight: " + weight);
        System.out.println("price : " + price);
        System.out.println("Base Diameter : " + baseDiameter);
    }
}