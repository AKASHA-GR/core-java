class Nurse{
	static void basicCheck(String patientName, String symptom, int bp, Boolean sugar){
		
		System.out.println("----------------------------");
		System.out.println("Basic Checking of a Patient:");
		System.out.println("----------------------------");
		
		System.out.println("patientName:" +patientName);
		System.out.println("Symptom:" +symptom);
		System.out.println("Bp of a Patient:" + bp);
		System.out.println("Dyabities:" + sugar);
		
		
		Doctor.treat(patientName,symptom);
	}
}