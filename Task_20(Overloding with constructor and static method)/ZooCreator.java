class ZooCreator{
	
	static void getZoo(){
		Zoo zoo = new Zoo();
		
		System.out.println("Printing the name and number of Animals as a Null.");
		System.out.println("The zoo name:" +zoo.name);
		System.out.println("The number of animals in Zoo:" +zoo.numberOfAnimals);
	}
	
	static void getZoo(String name){
		Zoo zoo = new Zoo(name);
		
		System.out.println("Geting Zoo name from user.");
		System.out.println("The Zoo name:" +zoo.name);
		
	}
	
	static void getZoo(int numberOfAnimals){
		Zoo zoo = new Zoo(numberOfAnimals);
		
		System.out.println("Geting numberOfAnimals in zoo from user.");
		System.out.println("The Number of animals:" +zoo.numberOfAnimals);
	}
	
}