class BBottle{
	int quantity;
	String size;
	
	
	BBottle(int quantity, String size){
		this.quantity = quantity;
		this.size = size;
	}
	
	void getBBottle(){
		System.out.println("The quantity: " + this.quantity);
		System.out.println("The bottle size: " + this.size);
	}
}