class Bottle{

	int quantity;
	String size;
	
	
	Bottle(int quantity, String size){
		this.quantity = quantity;
		this.size = size;
	}
	
	void getBottle(){
		System.out.println("The quantity: " + this.quantity);
		System.out.println("The bottle size: " + this.size);
	}
}