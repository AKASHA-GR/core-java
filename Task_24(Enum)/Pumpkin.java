class Pumpkin{
	double price;
	Weight weight; 
	Species species;
	
	Pumpkin(double price,Weight weight,Species species){
		this.price = price;
		this.weight = weight;
		this.species = species;
	}
	
	
	void printInfo(){
		System.out.println("The price of pumpkin:"+this.price);
		System.out.println("The Species of pumpkin:"+this.species);
		
		if(this.weight != null){
			this.weight.getWeight();
		}
	}
	
	
}