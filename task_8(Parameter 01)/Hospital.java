class Hospital{
	static void blookAppointment(String patientName, String symptom){
		
		System.out.println("----------------------------");
		System.out.println("Patient blookAppointment Appoitment:");
		System.out.println("----------------------------");
		
		System.out.println("patientName:" + patientName);
		System.out.println("Symptom" + symptom);
		int bp=10;
		Boolean sugar=true;
		
		Nurse.basicCheck(patientName,symptom,bp,sugar);
	}
}