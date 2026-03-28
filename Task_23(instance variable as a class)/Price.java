class Price{
	double basePrice;
	double GST;
	
	Price(double basePrice,double GST){
		this.basePrice = basePrice;
		this.GST = GST;
	}
	
	void getPrice(){
		System.out.println("The basePrice of Bell:"+this.basePrice);
		System.out.println("The GST of Bell:"+this.GST);
	}
}