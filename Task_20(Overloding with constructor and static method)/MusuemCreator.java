class MusuemCreator{
	
	static void getMusuem(String name,int numberOfBooks){
		
		System.out.println("Printing the name of musuem with the Number of Books.");

		Musuem musuem = new Musuem(name,numberOfBooks);
		System.out.println("The name of the Musuem:"+musuem.name);
		System.out.println("The numberOfBooks in Musuem:"+musuem.numberOfBooks);
		
	}
	
	static void getMusuem(){
		
		System.out.println("printing the musuem name and numberOfBooks as a Null.");
		
		Musuem musuem1 = new Musuem();
		System.out.println("The name of the musuem:"+musuem1.name);
		System.out.println("The numberOfBooks in musuem:"+musuem1.name);
		
	}
	
	static void getMusuem(int numberOfBooks){
		
		System.out.println("Only geting the numberOfBooks from user.");
		
		Musuem musuem2 = new Musuem(numberOfBooks);
        System.out.println("The number of Books:" +musuem2.numberOfBooks);		
	}
	
}