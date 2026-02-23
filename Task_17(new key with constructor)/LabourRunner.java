class LabourRunner{
	public static void main(String[] args){
		
	Labour labour1 = new Labour();
	
	labour1.name = "Ramesh Kumar";
	labour1.salary = 22000;
	labour1.idProofs = new String[] {"Aadhaar Card","Pan Card","Voter Id"};
	
	System.out.println("The name of Labour:" +labour1.name);
	System.out.println("The Salary of a Labour:" +labour1.name);
	for(int i=0;i<labour1.idProofs.length; i++){
		System.out.println("The ID Proofs of a Labour:" +labour1.idProofs[i]);
	}
	
	
	Labour labour2 = new Labour();
	
	labour2.name = "Ramesh Kumar";
	labour2.salary = 22000;
	labour2.idProofs = new String[] {"Aadhaar Card","Pan Card","Voter Id"};
	
	System.out.println("The name of Labour:" +labour2.name);
	System.out.println("The Salary of a Labour:" +labour2.name);
	for(int i=0;i<labour2.idProofs.length; i++){
		System.out.println("The ID Proofs of a Labour:" +labour2.idProofs[i]);
	}
	
	}
}