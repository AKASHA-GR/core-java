class Gum{
	Stirng brand;
	double baseprice;
	double profit;
	int count;
	String quality;
	int quantity;
	
	Gum(String brand,double baseprice,double profit,int count,String quality,int quantity){
		this.brand = brand;
		this.baseprice = baseprice;
		this.profit = profit;
		this.count = count;
		this.quality = quality;
		this.quantity = quantity'
	}
	
	void printInfo(){
		System.out.println("The  printInfo is exicuting in class Gum.");
		System.out.println("The Gum brand:"+brand);
		System.out.println("The baseprice:"+baseprice);
		System.out.println("The profit:"+profit);
		System.out.println("The count:"+count);
		System.out.println("The count:"+quality);
		System.out.println("The count:"+quantity);
	}
	
}