class Mobile{
	static void register(String patientName, String symptom, String email, long mobile){
		
		System.out.println("----------------------------");
		System.out.println("Registration of the Patient:");
		System.out.println("----------------------------");
		
		System.out.println("patientName:" + patientName);
		System.out.println("Symptom" + symptom);
		System.out.println("Email id:" +email );
		System.out.println("Mobile number:" +mobile);
		
		/*String patientName02 = "Abhi";
		String symptom01 = "clod456";
		String email01 = "Abhi@gmail.com";
		long mobile01 = 1234567899l;*/
		
		Reciption.book(patientName,symptom,email,mobile);
	}
}