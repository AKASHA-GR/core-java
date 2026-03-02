/*Declare below classes, then declare least 20 instance variables in every class . One constrcutor in each class,then instance method to display all the variables. Then in the runner create least 10 instances and invoke the method to display Google,
WallPaper,
Pepper,
Paper,
Garlic,
Stand,
Map,
Toxic,
PVR,
Trophy,
DumbBell,
Diabetes,
Brain,
Shampoo,
Conditioner,
Organ,
Cell,
Office,
Lotion,
Organizer,
Education
*/

class Diabetes {

    String type;
    String cause;
    String symptoms;
    String treatment;
    String medication;
    String dietPlan;
    String exercisePlan;
    String riskLevel;
    String diagnosisMethod;
    String affectedOrgan;
    int patientAge;
    int durationYears;
    int sugarLevel;
    int insulinLevel;
    int doctorVisitsPerYear;
    double fastingSugar;
    double postMealSugar;
    double hba1cLevel;
    double bodyWeight;
    double bmi;

    Diabetes(String type, String cause, String symptoms, String treatment, String medication,
             String dietPlan, String exercisePlan, String riskLevel, String diagnosisMethod, String affectedOrgan,
             int patientAge, int durationYears, int sugarLevel, int insulinLevel, int doctorVisitsPerYear,
             double fastingSugar, double postMealSugar, double hba1cLevel, double bodyWeight, double bmi) {

        this.type = type;
        this.cause = cause;
        this.symptoms = symptoms;
        this.treatment = treatment;
        this.medication = medication;
        this.dietPlan = dietPlan;
        this.exercisePlan = exercisePlan;
        this.riskLevel = riskLevel;
        this.diagnosisMethod = diagnosisMethod;
        this.affectedOrgan = affectedOrgan;
        this.patientAge = patientAge;
        this.durationYears = durationYears;
        this.sugarLevel = sugarLevel;
        this.insulinLevel = insulinLevel;
        this.doctorVisitsPerYear = doctorVisitsPerYear;
        this.fastingSugar = fastingSugar;
        this.postMealSugar = postMealSugar;
        this.hba1cLevel = hba1cLevel;
        this.bodyWeight = bodyWeight;
        this.bmi = bmi;
    }

		void display() {
		System.out.println("Type: " + type);
		System.out.println("Cause: " + cause);
		System.out.println("Symptoms: " + symptoms);
		System.out.println("Treatment: " + treatment);
		System.out.println("Medication: " + medication);
		System.out.println("Diet Plan: " + dietPlan);
		System.out.println("Exercise Plan: " + exercisePlan);
		System.out.println("Risk Level: " + riskLevel);
		System.out.println("Diagnosis Method: " + diagnosisMethod);
		System.out.println("Affected Organ: " + affectedOrgan);

		System.out.println("Patient Age: " + patientAge);
		System.out.println("Duration Years: " + durationYears);
		System.out.println("Sugar Level: " + sugarLevel);
		System.out.println("Insulin Level: " + insulinLevel);
		System.out.println("Doctor Visits Per Year: " + doctorVisitsPerYear);

		System.out.println("Fasting Sugar: " + fastingSugar);
		System.out.println("Post Meal Sugar: " + postMealSugar);
		System.out.println("HbA1c Level: " + hba1cLevel);
		System.out.println("Body Weight: " + bodyWeight);
		System.out.println("BMI: " + bmi);
	}
}