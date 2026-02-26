//Declare 12 classes with 5 IV, declare 6 constrctors in each class . Create a runner and create 6 instances for each class . Print variables for each instance. Droplet, Umbrella,Rain,Snow,HairDryer,Clip,ChessBoard, Track,Battery,Pawn,Carrom,Strawberry

class Rine{
	String season;
	String location;
	int duration;
	boolean thunder;
	double temperature;
	
	Rine(){
		System.out.println("The constructor is created without the Argument.");
	}
	
	
	Rine(String season,String location,int duration,boolean thunder,double temperature){
		this.season = season;
		this.location = location;
		this.duration = duration;
		this.thunder = thunder;
		this.temperature = temperature;
	}
	
	
	Rine(String season){
		this.season = season;
	}
	
	Rine(String location,int duration){
		this.location = location;
		this.duration = duration;
	}
	
	Rine(boolean thunder){
		this.thunder = thunder;
	}
	
	Rine(double temperature){
		this.temperature = temperature;
	}
}