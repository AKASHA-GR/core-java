class Organizer {

    String name;
    String type;
    String eventName;
    String organizationName;
    String country;
    String city;
    String contactPerson;
    String email;
    String phoneNumber;
    String sponsor;
    int establishedYear;
    int totalEventsConducted;
    int totalEmployees;
    int popularityRank;
    int rating;
    double annualBudget;
    double eventBudget;
    double ticketPrice;
    double revenueGenerated;
    double hallCapacity;

    Organizer(String name, String type, String eventName, String organizationName,
              String country, String city, String contactPerson, String email,
              String phoneNumber, String sponsor, int establishedYear,
              int totalEventsConducted, int totalEmployees, int popularityRank,
              int rating, double annualBudget, double eventBudget,
              double ticketPrice, double revenueGenerated, double hallCapacity) {

        this.name = name;
        this.type = type;
        this.eventName = eventName;
        this.organizationName = organizationName;
        this.country = country;
        this.city = city;
        this.contactPerson = contactPerson;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.sponsor = sponsor;
        this.establishedYear = establishedYear;
        this.totalEventsConducted = totalEventsConducted;
        this.totalEmployees = totalEmployees;
        this.popularityRank = popularityRank;
        this.rating = rating;
        this.annualBudget = annualBudget;
        this.eventBudget = eventBudget;
        this.ticketPrice = ticketPrice;
        this.revenueGenerated = revenueGenerated;
        this.hallCapacity = hallCapacity;
    }

    void display() {
        System.out.println("Organizer Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Event Name: " + eventName);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Country: " + country);
        System.out.println("City: " + city);
        System.out.println("Contact Person: " + contactPerson);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Sponsor: " + sponsor);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Total Events Conducted: " + totalEventsConducted);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Popularity Rank: " + popularityRank);
        System.out.println("Rating: " + rating);
        System.out.println("Annual Budget: " + annualBudget);
        System.out.println("Event Budget: " + eventBudget);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Revenue Generated: " + revenueGenerated);
        System.out.println("Hall Capacity: " + hallCapacity);
    }
}


