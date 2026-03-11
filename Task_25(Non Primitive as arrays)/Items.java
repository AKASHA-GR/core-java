class Items{
	String name;
	double price;
	
	Items(String name,double price){
		this.name = name;
		this.price = price;
	}
	
	void getItems(){
		System.out.println("The name of the item:"+this.name);
		System.out.println("The price of the item per kg:"+this.price);
	}
}