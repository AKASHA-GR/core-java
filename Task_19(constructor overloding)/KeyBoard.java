//Declare 12 classes with 5 IV, declare 6 constrctors in each class . Create a runner and create 6 instances for each class . Print variables for each instance. Droplet, Umbrella,Rain,Snow,HairDryer,Clip,ChessBoard, Track,Battery,Pawn,Carrom,Strawberry

class KeyBoard{
	String brand;
	String model;
	String color;
	int numberOfKeys;
	double price;
	
	
	KeyBoard(){
		System.out.println("The Constructor is Create with out Argument.");
	}
	
	KeyBoard(String brand){
		this.brand = brand;
	}
	
	KeyBoard(String brand,String model){
		this.brand = brand;
		this.model = model;
	}
	
	KeyBoard(String model,double price){
		this.model = model;
		this.price = price;
	}
	
	KeyBoard(String color,int numberOfKeys){
		this.color = color;
		this.numberOfKeys = numberOfKeys;
	}
	
	KeyBoard(int numberOfKeys,double price){
		this.numberOfKeys = numberOfKeys;
		this.price = price;
	}
}

