class Product{
	String name;
	String make;
	String mfgDate;
	Type type;
	double cost;
	String seller;
	WarrentYears year;
	boolean warrentyExpired;
	int uniqueId;
	String originCountry;
	
	Product(String name,String make,String mfgDate,Type type,double cost,String seller,WarrentYears year,boolean warrentyExpired,int uniqueId,String originCountry){
		this.name = name;
		this.make = make;
		this.mfgDate = mfgDate;
		this.type = type;
		this.cost = cost;
		this.seller = seller;
		this.year = year;
		this.warrentyExpired = warrentyExpired;
		this.uniqueId = uniqueId;
		this.originCountry = originCountry;
	}
	
	void printInfo(){
		System.out.println("The printInfo is exicuting in class Product.");
		System.out.println("The name of the product:"+this.name);
		System.out.println("The making place of product:"+this.make);
		System.out.println("The mfgDate of the product:"+this.mfgDate);
		System.out.println("The type of the product:"+this.type);
		System.out.println("The cost of the product:"+this.cost);
		System.out.println("The seller of the product:"+this.seller);
		System.out.println("The WarrentYears of the product:"+this.year);
		System.out.println("The warrentyExpired:"+this.warrentyExpired);
		System.out.println("The uniqueId of the product:"+this.uniqueId);
		System.out.println("The originCountry of the product:"+this.originCountry);
	}
	
}