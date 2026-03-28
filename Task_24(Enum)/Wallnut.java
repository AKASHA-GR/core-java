class Wallnut{
	double price;
	Variety variety;
	Protein protein;
	
	Wallnut(double price,Variety variety,Protein protein){
		this.price = price;
		this.variety = variety;
		this.protein = protein;
	}
	
	void printInfo(){
		System.out.println("The price of wallnut:"+this.price);
		System.out.println("The protein of wallnut:"+this.protein);
		
		if(this.variety != null){
			this.variety.getVeriety();
		}else {
			System.out.println("The veraity is null.");
		}
	}
	
	
}