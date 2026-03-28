class Tea{
	String brand;
	String location;
	String type;
	double price;
	int numberofKG;
	History history;
	Year year;
	Quality quality;
	Size size;
	Aproved aproved;
	
	
	Tea(String brand,String location,String type,double price,int numberofKG,History history,Year year,Quality quality,Size size,Aproved aproved){
		this.brand = brand;
		this.location = location;
		this.type = type;
		this.price = price;
		this.numberofKG = numberofKG;
		this.history  = history;
		this.year = year;
		this.quality = quality;
		this.size = size;
		this.aproved = aproved;
	}
	
	void getTea(){
		System.out.println("The brand of Tea:" +this.brand);
		System.out.println("The location of Tea:" +this.location);
		System.out.println("The type of Tea:" +this.type);
		System.out.println("The price of Tea:" +this.price);
		System.out.println("The numberofKG of Tea:" +this.numberofKG);
		
		if(history != null){
			this.history.getHistory();			
		}else{
			System.out.println("there is is not defined...");
		}
		
		if(year != null){
			this.year.getYear();
		}else{
			System.out.println("there is is not defined...");
		}
		
		if(history != null){
			this.quality.getQuality();
		}else{
			System.out.println("there is is not defined...");
		}
		
		if(history != null){
			this.size.getSize();
		}else{
			System.out.println("there is is not defined...");
		}
		
		if(history != null){
			this.aproved.getAproved();
		}else{
			System.out.println("there is is not defined...");
		}
		
		
		
		
		
	}
}