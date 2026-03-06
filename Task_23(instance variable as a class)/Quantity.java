class Quantity{
	double quantityInLetter;
	boolean freshWater;
	
	Quantity(double quantityInLetter,boolean freshWater){
		this.quantityInLetter = quantityInLetter;
		this.freshWater = freshWater;
	}
	
	void getQuantity(){
		System.out.println("The quantityInLetter:" +this.quantityInLetter);
		System.out.println("The freshWater:" +this.freshWater);
	}
}