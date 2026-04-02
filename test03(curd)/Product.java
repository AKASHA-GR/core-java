class Product{
	int productID;
	String productName;
	String company;
	String manufactureDate;
	String expDate;
	Type type;
	double price;
	double weightGrams;
	
	Product(int productID,String productName,String company,String manufactureDate,String expDate,Type type,double price,double weightGrams){
		this.productID = productID;
		this.productName = productName;
		this.company = company;
		this.manufactureDate = manufactureDate;
		this.expDate = expDate;
		this.type = type;
		this.price = price;
		this.weightGrams = weightGrams;
	}
	
	void display(){
		System.out.println("The display method is exicuting in class Product.");
		System.out.println("The productName:"+this.productName);
		System.out.println("The productID:"+this.productID);
		System.out.println("The company of a product:"+this.company);
		System.out.println("The manufactureDate of a product:"+this.manufactureDate);
		System.out.println("The expDate of product:"+this.expDate);
		System.out.println("The type of product:"+this.type);
		System.out.println("The price of a product:"+this.price);
		System.out.println("The weightGrams of a product:"+this.weightGrams);
	}
	
	
}