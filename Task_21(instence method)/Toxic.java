class Toxic {

    String chemicalName;
    String commonName;
    String category;
    String physicalState;
    String color;
    String odor;
    String source;
    String hazardLevel;
    String storageCondition;

    double molecularWeight;
    double density;
    double boilingPoint;
    double meltingPoint;
    double toxicityLevel;

    int quantityAvailable;
    int expiryYear;
    int safetyRating;
    int containerCapacity;
    int warningLevel;

    boolean flammable;
    boolean corrosive;

    Toxic(String chemicalName, String commonName, String category, String physicalState,
          String color, String odor, String source, String hazardLevel,
          String storageCondition, double molecularWeight, double density,
          double boilingPoint, double meltingPoint, double toxicityLevel,
          int quantityAvailable, int expiryYear, int safetyRating,
          int containerCapacity, int warningLevel,
          boolean flammable, boolean corrosive) {

        this.chemicalName = chemicalName;
        this.commonName = commonName;
        this.category = category;
        this.physicalState = physicalState;
        this.color = color;
        this.odor = odor;
        this.source = source;
        this.hazardLevel = hazardLevel;
        this.storageCondition = storageCondition;
        this.molecularWeight = molecularWeight;
        this.density = density;
        this.boilingPoint = boilingPoint;
        this.meltingPoint = meltingPoint;
        this.toxicityLevel = toxicityLevel;
        this.quantityAvailable = quantityAvailable;
        this.expiryYear = expiryYear;
        this.safetyRating = safetyRating;
        this.containerCapacity = containerCapacity;
        this.warningLevel = warningLevel;
        this.flammable = flammable;
        this.corrosive = corrosive;
    }

    void display() {
        System.out.println("Chemical Name: " + chemicalName);
        System.out.println("Common Name: " + commonName);
        System.out.println("Category: " + category);
        System.out.println("Physical State: " + physicalState);
        System.out.println("Color: " + color);
        System.out.println("Odor: " + odor);
        System.out.println("Source: " + source);
        System.out.println("Hazard Level: " + hazardLevel);
        System.out.println("Storage Condition: " + storageCondition);
        System.out.println("Molecular Weight: " + molecularWeight);
        System.out.println("Density: " + density);
        System.out.println("Boiling Point: " + boilingPoint);
        System.out.println("Melting Point: " + meltingPoint);
        System.out.println("Toxicity Level: " + toxicityLevel);
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("Expiry Year: " + expiryYear);
        System.out.println("Safety Rating: " + safetyRating);
        System.out.println("Container Capacity: " + containerCapacity);
        System.out.println("Warning Level: " + warningLevel);
        System.out.println("Flammable: " + flammable);
        System.out.println("Corrosive: " + corrosive);
    }
}