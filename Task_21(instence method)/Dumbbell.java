class Dumbbell {

    String brand;
    String material;
    String color;
    String type;
    String gripType;
    String coating;
    String usage;
    String countryOfOrigin;
    String shape;
    String fitnessLevel;
    int quantityAvailable;
    int warrantyYears;
    int durabilityRating;
    int popularityRank;
    int productionYear;
    double weight;
    double price;
    double length;
    double handleDiameter;
    double maxLoadCapacity;

    Dumbbell(String brand, String material, String color, String type, String gripType,
             String coating, String usage, String countryOfOrigin, String shape, String fitnessLevel,
             int quantityAvailable, int warrantyYears, int durabilityRating, int popularityRank, int productionYear,
             double weight, double price, double length, double handleDiameter, double maxLoadCapacity) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
        this.gripType = gripType;
        this.coating = coating;
        this.usage = usage;
        this.countryOfOrigin = countryOfOrigin;
        this.shape = shape;
        this.fitnessLevel = fitnessLevel;
        this.quantityAvailable = quantityAvailable;
        this.warrantyYears = warrantyYears;
        this.durabilityRating = durabilityRating;
        this.popularityRank = popularityRank;
        this.productionYear = productionYear;
        this.weight = weight;
        this.price = price;
        this.length = length;
        this.handleDiameter = handleDiameter;
        this.maxLoadCapacity = maxLoadCapacity;
    }

	   void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Color: " + color);
		System.out.println("Type: " + type);
		System.out.println("Grip Type: " + gripType);
		System.out.println("Coating: " + coating);
		System.out.println("Usage: " + usage);
		System.out.println("Country Of Origin: " + countryOfOrigin);
		System.out.println("Shape: " + shape);
		System.out.println("Fitness Level: " + fitnessLevel);

		System.out.println("Quantity Available: " + quantityAvailable);
		System.out.println("Warranty Years: " + warrantyYears);
		System.out.println("Durability Rating: " + durabilityRating);
		System.out.println("Popularity Rank: " + popularityRank);
		System.out.println("Production Year: " + productionYear);

		System.out.println("Weight: " + weight + " kg");
		System.out.println("Price: " + price);
		System.out.println("Length: " + length + " cm");
		System.out.println("Handle Diameter: " + handleDiameter + " cm");
		System.out.println("Max Load Capacity: " + maxLoadCapacity + " kg");
	}
}