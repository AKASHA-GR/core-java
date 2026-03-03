class Office {

    String name;
    String type;
    String location;
    String companyName;
    String country;
    String managerName;
    String department;
    String buildingType;
    String workingHours;
    String contactEmail;
    int establishedYear;
    int totalEmployees;
    int totalDepartments;
    int floorCount;
    int parkingCapacity;
    double totalArea;
    double electricityConsumption;
    double internetSpeed;
    double monthlyRent;
    double maintenanceCost;

    Office(String name, String type, String location, String companyName, String country,
           String managerName, String department, String buildingType, String workingHours, String contactEmail,
           int establishedYear, int totalEmployees, int totalDepartments, int floorCount, int parkingCapacity,
           double totalArea, double electricityConsumption, double internetSpeed, double monthlyRent, double maintenanceCost) {

        this.name = name;
        this.type = type;
        this.location = location;
        this.companyName = companyName;
        this.country = country;
        this.managerName = managerName;
        this.department = department;
        this.buildingType = buildingType;
        this.workingHours = workingHours;
        this.contactEmail = contactEmail;
        this.establishedYear = establishedYear;
        this.totalEmployees = totalEmployees;
        this.totalDepartments = totalDepartments;
        this.floorCount = floorCount;
        this.parkingCapacity = parkingCapacity;
        this.totalArea = totalArea;
        this.electricityConsumption = electricityConsumption;
        this.internetSpeed = internetSpeed;
        this.monthlyRent = monthlyRent;
        this.maintenanceCost = maintenanceCost;
    }

    void display() {
        System.out.println("Office Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Location: " + location);
        System.out.println("Company Name: " + companyName);
        System.out.println("Country: " + country);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Department: " + department);
        System.out.println("Building Type: " + buildingType);
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Contact Email: " + contactEmail);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Departments: " + totalDepartments);
        System.out.println("Floor Count: " + floorCount);
        System.out.println("Parking Capacity: " + parkingCapacity);
        System.out.println("Total Area: " + totalArea);
        System.out.println("Electricity Consumption: " + electricityConsumption);
        System.out.println("Internet Speed: " + internetSpeed);
        System.out.println("Monthly Rent: " + monthlyRent);
        System.out.println("Maintenance Cost: " + maintenanceCost);
    }
}


