class PVR {

    String name;
    String location;
    String city;
    String state;
    String country;
    String screenType;
    String seatType;
    String foodCourt;
    String managerName;
    String contactEmail;
    int totalScreens;
    int totalSeats;
    int parkingCapacity;
    int numberOfEmployees;
    int establishedYear;
    double ticketPrice;
    double rating;
    double screenSize;
    double monthlyRevenue;
    double maintenanceCost;

    PVR(String name, String location, String city, String state, String country,
        String screenType, String seatType, String foodCourt, String managerName, String contactEmail,
        int totalScreens, int totalSeats, int parkingCapacity, int numberOfEmployees, int establishedYear,
        double ticketPrice, double rating, double screenSize, double monthlyRevenue, double maintenanceCost) {

        this.name = name;
        this.location = location;
        this.city = city;
        this.state = state;
        this.country = country;
        this.screenType = screenType;
        this.seatType = seatType;
        this.foodCourt = foodCourt;
        this.managerName = managerName;
        this.contactEmail = contactEmail;
        this.totalScreens = totalScreens;
        this.totalSeats = totalSeats;
        this.parkingCapacity = parkingCapacity;
        this.numberOfEmployees = numberOfEmployees;
        this.establishedYear = establishedYear;
        this.ticketPrice = ticketPrice;
        this.rating = rating;
        this.screenSize = screenSize;
        this.monthlyRevenue = monthlyRevenue;
        this.maintenanceCost = maintenanceCost;
    }

    void display() {
        System.out.println("PVR Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Screens Type: " + screenType);                  
        System.out.println("Seat Type: " + seatType);
        System.out.println("Food Court: " + foodCourt);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Contact Email: " + contactEmail);
        System.out.println("Total Screens : " + totalScreens);
        System.out.println("Total Seats : " + totalSeats);
        System.out.println("Parking Capacity : " + parkingCapacity);
        System.out.println("Number Of Employees : " + numberOfEmployees);
        System.out.println("Established Year : " + establishedYear);
        System.out.println("Rating : " + rating);
        System.out.println("Screen Size : " + screenSize);
        System.out.println("Monthly Revenue : " + monthlyRevenue);
        System.out.println("Maintenance Cost : " + maintenanceCost);

    }
	    
}