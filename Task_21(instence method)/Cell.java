class Cell {

    String name;
    String type;
    String shape;
    String function;
    String location;
    String cellWallPresence;
    String nucleusType;
    String color;
    String discoveredBy;
    String organismType;
    int discoveryYear;
    int chromosomeCount;
    int lifespanDays;
    int importanceRank;
    int complexityLevel;
    double sizeMicrometer;
    double phLevel;
    double temperature;
    double energyProductionRate;
    double reproductionRate;

    Cell(String name, String type, String shape, String function, String location,
         String cellWallPresence, String nucleusType, String color, String discoveredBy, String organismType,
         int discoveryYear, int chromosomeCount, int lifespanDays, int importanceRank, int complexityLevel,
         double sizeMicrometer, double phLevel, double temperature, double energyProductionRate, double reproductionRate) {

        this.name = name;
        this.type = type;
        this.shape = shape;
        this.function = function;
        this.location = location;
        this.cellWallPresence = cellWallPresence;
        this.nucleusType = nucleusType;
        this.color = color;
        this.discoveredBy = discoveredBy;
        this.organismType = organismType;
        this.discoveryYear = discoveryYear;
        this.chromosomeCount = chromosomeCount;
        this.lifespanDays = lifespanDays;
        this.importanceRank = importanceRank;
        this.complexityLevel = complexityLevel;
        this.sizeMicrometer = sizeMicrometer;
        this.phLevel = phLevel;
        this.temperature = temperature;
        this.energyProductionRate = energyProductionRate;
        this.reproductionRate = reproductionRate;
    }

    void display() {
        System.out.println("Cell Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Shape: " + shape);
        System.out.println("Function: " + function);
        System.out.println("Location: " + location);
        System.out.println("Cell Wall Presence: " + cellWallPresence);
        System.out.println("Nucleus Type: " + nucleusType);
        System.out.println("Color: " + color);
        System.out.println("Discovered By: " + discoveredBy);
        System.out.println("Organism Type: " + organismType);
        System.out.println("Discovery Year: " + discoveryYear);
        System.out.println("Chromosome Count: " + chromosomeCount);
        System.out.println("Lifespan (Days): " + lifespanDays);
        System.out.println("Importance Rank: " + importanceRank);
        System.out.println("Complexity Level: " + complexityLevel);
        System.out.println("Size (Micrometer): " + sizeMicrometer);
        System.out.println("pH Level: " + phLevel);
        System.out.println("Temperature: " + temperature);
        System.out.println("Energy Production Rate: " + energyProductionRate);
        System.out.println("Reproduction Rate: " + reproductionRate);
    }
}


