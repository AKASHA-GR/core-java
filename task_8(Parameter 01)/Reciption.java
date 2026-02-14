class Reciption{
	static void book(String patientName, String symptom, String email, long mobile){
		
		System.out.println("----------------------------");
		System.out.println("Reciption Booking information:");
		System.out.println("----------------------------");
		
		System.out.println("patientName:" + patientName);
		System.out.println("Symptom" + symptom);
		System.out.println("Email id:" +email );
		System.out.println("Mobile number:" +mobile);
		//int bp=10;
		//Boolean suger=true;
		//String patientName03 = "DANA";
		//String symptom03 = "normal feaver";
		Hospital.blookAppointment(patientName,symptom);
	}
}