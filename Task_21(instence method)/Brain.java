class Brain {

    String partName;
    String function;
    String hemisphere;
    String lobe;
    String nerveConnection;
    String bloodSupply;
    String protectionLayer;
    String relatedDisease;
    String memoryType;
    String consciousnessLevel;
    int neuronCount;
    int age;
    int reactionTime;
    int iqLevel;
    int memoryCapacity;
    double weight;
    double oxygenUsage;
    double glucoseUsage;
    double processingSpeed;
    double temperature;

    Brain(String partName, String function, String hemisphere, String lobe,
          String nerveConnection, String bloodSupply, String protectionLayer,
          String relatedDisease, String memoryType, String consciousnessLevel,
          int neuronCount, int age, int reactionTime, int iqLevel, int memoryCapacity,
          double weight, double oxygenUsage, double glucoseUsage,
          double processingSpeed, double temperature) {

        this.partName = partName;
        this.function = function;
        this.hemisphere = hemisphere;
        this.lobe = lobe;
        this.nerveConnection = nerveConnection;
        this.bloodSupply = bloodSupply;
        this.protectionLayer = protectionLayer;
        this.relatedDisease = relatedDisease;
        this.memoryType = memoryType;
        this.consciousnessLevel = consciousnessLevel;
        this.neuronCount = neuronCount;
        this.age = age;
        this.reactionTime = reactionTime;
        this.iqLevel = iqLevel;
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
        this.oxygenUsage = oxygenUsage;
        this.glucoseUsage = glucoseUsage;
        this.processingSpeed = processingSpeed;
        this.temperature = temperature;
    }

    void display() {
        System.out.println("Part Name: " + partName);
        System.out.println("Function: " + function);
        System.out.println("Hemisphere: " + hemisphere);
        System.out.println("Lobe: " + lobe);
        System.out.println("Nerve Connection: " + nerveConnection);
        System.out.println("Blood Supply: " + bloodSupply);
        System.out.println("Protection Layer: " + protectionLayer);
        System.out.println("Related Disease: " + relatedDisease);
        System.out.println("Memory Type: " + memoryType);
        System.out.println("Consciousness Level: " + consciousnessLevel);
        System.out.println("Neuron Count: " + neuronCount);
        System.out.println("Age: " + age);
        System.out.println("Reaction Time: " + reactionTime);
        System.out.println("IQ Level: " + iqLevel);
        System.out.println("Memory Capacity: " + memoryCapacity);
        System.out.println("Weight: " + weight);
        System.out.println("Oxygen Usage: " + oxygenUsage);
        System.out.println("Glucose Usage: " + glucoseUsage);
        System.out.println("Processing Speed: " + processingSpeed);
        System.out.println("Temperature: " + temperature);
    }
}