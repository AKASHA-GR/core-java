/*Doctor --> treat(String name,String symptom); 
  Nurse --> basicCheck(String patientName,String symptom,int bp,boolean sugar); 
  Hospital--> bookAppointment(String patientName,String symptom); 
  Reception--> book(String patientName,String symptom,String email,long mobile) 
  Mobile --> register(String patientName,String symptom,String email,long mobile) 
  Patient--> sick() 
  PatientRunner 
  Complete Feb 6 th  and  Best Of HardWork
  */
  
class Doctor{
	static void treat(String name, String symptom){
		
		System.out.println("----------------------------");
		System.out.println("Patient Details:");
		System.out.println("----------------------------");
		
		System.out.println("Patiant Name:" + name);
		System.out.println("Symtom:" + symptom);
	}
}