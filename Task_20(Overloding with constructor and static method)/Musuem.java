//Declare below 6 types, then declare 2 variables in each class, then write over-loaded const to init those variables. Write 3 seperate creator classes to create an instances. Each Creator declare three over-loaded static methods to create instances , print the IV of the instance created . Create a Runner to invoke all the methods of creator classes. Musuem Zoo Stadium MusuemCreator ZooCreator StadiumCreator

class Musuem{
	
	String name;
	int numberOfBooks;
	
	Musuem(){
		System.out.println("The Musuem constructor is ctcreated without a Parameter.");
	}
	
	
	Musuem(String name,int numberOfBooks){
		this.name = name;
		this.numberOfBooks = numberOfBooks;
	}
	
	Musuem(int numberOfBooks){
		this.numberOfBooks = numberOfBooks;
	}
}