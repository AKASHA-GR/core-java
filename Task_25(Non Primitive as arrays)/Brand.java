class Brand{
	String name;
	double price;
	
	Brand(String name,double price){
		this.name = name;
		this.price = price;
	}
	
	void getBrand(){
		System.out.println("The name of brand:"+this.name);
		System.out.println("The price of Scanner:"+this.price);
	}
}