//Declare 12 classes with 5 IV, declare 6 constrctors in each class . Create a runner and create 6 instances for each class . Print variables for each instance. Droplet, Umbrella,Rain,Snow,HairDryer,Clip,ChessBoard, Track,Battery,Pawn,Carrom,Strawberry

class Umbrella{
	String brand; 
	String color;
	boolean automatic;
	boolean windproof;
	int ribsCount;
	
	Umbrella(){
		System.out.println("The constrctor is created without an Argument.");
	}
	
	Umbrella(String brand,String color,boolean automatic,boolean windproof,int ribsCount){
		this.brand = brand;
		this.color = color;
		this.automatic = automatic;
		this.windproof = windproof;
		this.ribsCount = ribsCount;
	}
	
	Umbrella(String brand,String color){
		this.brand = brand;
		this.color = color;
	}
	
	Umbrella(String color,boolean automatic){
		this.color = color;
		this.automatic = automatic;
	}
	
	Umbrella(boolean automatic, boolean windproof){
		this.automatic = automatic;
		this.windproof = windproof;
	}
	
	Umbrella(boolean windproof,int ribsCount){
		this.windproof = windproof;
		this.ribsCount = ribsCount;
	}
}