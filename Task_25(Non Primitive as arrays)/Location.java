class Location{
	String name;
	double price;
	
	
	Location(String name,double price){
		this.name = name;
		this.price = price;
	}
	
	void getLocation(){
		System.out.println("The Tower location:"+this.name);
		System.out.println("The tiket price:" +this.price);
	}
}