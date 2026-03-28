class House{
	String apartmentName;
	double fee;
	
	House(String apartmentName,double fee){
		this.apartmentName = apartmentName;
		this.fee = fee;
	}
	
	void getHouse(){
		System.out.println("The Apartment Name:"+this.apartmentName);
		System.out.println("The broker fees:"+this.fee);
	}
}