class Horlicks{

	String brand;
	Bottle bottle;
	Flavor flavor;
	
	
	Horlicks(String brand, Bottle bottle, Flavor flavor){
		this.brand = brand;
		this.bottle = bottle;
		this.flavor = flavor;
	}
	
	void printInfo(){
		System.out.println("The Horlicks brand: " + this.brand);
		
		if(this.bottle != null){
			this.bottle.getBottle();
		}else{
			System.out.println("Bottle is null.");
		}
		
		System.out.println("The Horlicks flavor: " + this.flavor);
	}
}