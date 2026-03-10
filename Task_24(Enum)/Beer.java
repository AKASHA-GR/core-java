class Beer{
	String company;
	BBottle bottle;
	Brand brand;
	
	
	Beer(String company, BBottle bottle, Brand brand){
		this.company = company;
		this.bottle = bottle;
		this.brand = brand;
	}
	
	void printInfo(){
		System.out.println("The beer company: " + this.company);
		
		if(this.bottle != null){
			this.bottle.getBBottle();
		}else{
			System.out.println("The bottle is null.");
		}
		
		System.out.println("The beer brand: " + this.brand);
	}
}