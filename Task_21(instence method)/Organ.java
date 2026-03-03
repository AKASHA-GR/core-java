class Organ {

    String name;
    String system;
    String location;
    String shape;
    String function;
    String color;
    String texture;
    String associatedDisease;
    String bloodSupply;
    String nerveSupply;
    int averageWeight;
    int averageLength;
    int averageWidth;
    int cellTypesCount;
    int importanceRank;
    double oxygenConsumptionRate;
    double regenerationRate;
    double phLevel;
    double temperature;
    double bloodFlowRate;

    Organ(String name, String system, String location, String shape, String function,
          String color, String texture, String associatedDisease, String bloodSupply, String nerveSupply,
          int averageWeight, int averageLength, int averageWidth, int cellTypesCount, int importanceRank,
          double oxygenConsumptionRate, double regenerationRate, double phLevel, double temperature, double bloodFlowRate) {

        this.name = name;
        this.system = system;
        this.location = location;
        this.shape = shape;
        this.function = function;
        this.color = color;
        this.texture = texture;
        this.associatedDisease = associatedDisease;
        this.bloodSupply = bloodSupply;
        this.nerveSupply = nerveSupply;
        this.averageWeight = averageWeight;
        this.averageLength = averageLength;
        this.averageWidth = averageWidth;
        this.cellTypesCount = cellTypesCount;
        this.importanceRank = importanceRank;
        this.oxygenConsumptionRate = oxygenConsumptionRate;
        this.regenerationRate = regenerationRate;
        this.phLevel = phLevel;
        this.temperature = temperature;
        this.bloodFlowRate = bloodFlowRate;
    }

    void display() {
        System.out.println("Organ Name: " + name);
        System.out.println("System: " + system);
        System.out.println("Location: " + location);
        System.out.println("Shape: " + shape);
        System.out.println("Function: " + function);
        System.out.println("Color: " + color);
        System.out.println("Texture: " + texture);
        System.out.println("Associated Disease: " + associatedDisease);
        System.out.println("Blood Supply: " + bloodSupply);
        System.out.println("Nerve Supply: " + nerveSupply);
        System.out.println("Average Weight: " + averageWeight);
        System.out.println("Average Length: " + averageLength);
        System.out.println("Average Width: " + averageWidth);
        System.out.println("Cell Types Count: " + cellTypesCount);
        System.out.println("Importance Rank: " + importanceRank);
        System.out.println("Oxygen Consumption Rate: " + oxygenConsumptionRate);
        System.out.println("Regeneration Rate: " + regenerationRate);
        System.out.println("pH Level: " + phLevel);
        System.out.println("Temperature: " + temperature);
        System.out.println("Blood Flow Rate: " + bloodFlowRate);
    }
}


