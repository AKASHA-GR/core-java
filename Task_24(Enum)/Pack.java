class Pack{
	int quantity;
	String size;
	
	
	Pack(int quantity,String size){
		this.quantity = quantity;
		this.size = size;
	}
	
	void getPack(){
		System.out.println("The quantity: " + this.quantity);
		System.out.println("The pack size: " + this.size);
	}
}