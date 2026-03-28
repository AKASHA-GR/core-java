class Education {

    String institutionName;
    String courseName;
    String degreeType;
    String stream;
    String universityName;
    String country;
    String state;
    String city;
    String accreditation;
    String modeOfStudy;
    int establishedYear;
    int courseDurationYears;
    int totalStudents;
    int totalFaculty;
    int ranking;
    double annualFee;
    double admissionFee;
    double scholarshipAmount;
    double campusArea;
    double placementPercentage;

    Education(String institutionName, String courseName, String degreeType, String stream,
              String universityName, String country, String state, String city,
              String accreditation, String modeOfStudy, int establishedYear,
              int courseDurationYears, int totalStudents, int totalFaculty,
              int ranking, double annualFee, double admissionFee,
              double scholarshipAmount, double campusArea, double placementPercentage) {

        this.institutionName = institutionName;
        this.courseName = courseName;
        this.degreeType = degreeType;
        this.stream = stream;
        this.universityName = universityName;
        this.country = country;
        this.state = state;
        this.city = city;
        this.accreditation = accreditation;
        this.modeOfStudy = modeOfStudy;
        this.establishedYear = establishedYear;
        this.courseDurationYears = courseDurationYears;
        this.totalStudents = totalStudents;
        this.totalFaculty = totalFaculty;
        this.ranking = ranking;
        this.annualFee = annualFee;
        this.admissionFee = admissionFee;
        this.scholarshipAmount = scholarshipAmount;
        this.campusArea = campusArea;
        this.placementPercentage = placementPercentage;
    }

    void display() {
        System.out.println("Institution Name: " + institutionName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Degree Type: " + degreeType);
        System.out.println("Stream: " + stream);
        System.out.println("University Name: " + universityName);
        System.out.println("Country: " + country);
        System.out.println("State: " + state);
        System.out.println("City: " + city);
        System.out.println("Accreditation: " + accreditation);
        System.out.println("Mode Of Study: " + modeOfStudy);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Course Duration (Years): " + courseDurationYears);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Total Faculty: " + totalFaculty);
        System.out.println("Ranking: " + ranking);
        System.out.println("Annual Fee: " + annualFee);
        System.out.println("Admission Fee: " + admissionFee);
        System.out.println("Scholarship Amount: " + scholarshipAmount);
        System.out.println("Campus Area (Acres): " + campusArea);
        System.out.println("Placement Percentage: " + placementPercentage);
    }
}


