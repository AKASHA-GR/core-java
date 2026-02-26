//Declare 12 classes with 5 IV, declare 6 constrctors in each class . Create a runner and create 6 instances for each class . Print variables for each instance. Droplet, Umbrella,Rain,Snow,HairDryer,Clip,ChessBoard, Track,Battery,Pawn,Carrom,Strawberry

class HairDryer{
	String brand;
	String color;
	int speedLevels;
	double price;
	boolean hasCoolShot;
	
	HairDryer(){
		System.out.println("The constructor is created without the an Argument.");
	}
	
	HairDryer(String brand,String color){
		this.brand = brand;
		this.color = color;
	}
	
	
	HairDryer(String brand,String color,int speedLevels){
		this.brand = brand;
		this.color = color;
		this.speedLevels = speedLevels;
	}
	
	
	HairDryer(double price,boolean hasCoolShot){
		this.price = price;
		this.hasCoolShot = hasCoolShot;
	}
	
	HairDryer(String color,boolean hasCoolShot){
		this.color = color;
		this.hasCoolShot = hasCoolShot;
	}
	
	
	HairDryer(String brand,double price){
		this.brand = brand;
		this.price = price;
	}
	
}