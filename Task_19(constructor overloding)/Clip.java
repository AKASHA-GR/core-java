//Declare 12 classes with 5 IV, declare 6 constrctors in each class . Create a runner and create 6 instances for each class . Print variables for each instance. Droplet, Umbrella,Rain,Snow,HairDryer,Clip,ChessBoard, Track,Battery,Pawn,Carrom,Strawberry

class Clip{
	String type;
	String meterial;
	String color;
	double price;
	int quantity;
	
	Clip(){
		System.out.println("The constructor is created without an Argument.");
	}
	
	
	Clip(String type){
		this.type = type;
	}
	
	Clip(String meterial, String color){
		this.meterial = meterial;
		this.color = color;
	}
	
	
	Clip(String type,String meterial,String color){
		this.type = type;
		this.meterial = meterial;
		this.color = color;
	}
	
	Clip(double price){
		this.price = price;
	}
	
	
	Clip(int quantity){
		this.quantity = quantity;
	}
	

}