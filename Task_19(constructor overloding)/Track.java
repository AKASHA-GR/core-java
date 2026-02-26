//Declare 12 classes with 5 IV, declare 6 constrctors in each class . Create a runner and create 6 instances for each class . Print variables for each instance. Droplet, Umbrella,Rain,Snow,HairDryer,Clip,ChessBoard, Track,Battery,Pawn,Carrom,Strawberry

class Track{
	String type;
	String surfaceMaterial;
	double lengthMeters;
	int lanes;
	boolean floodLights;
	
	
	Track(){
		System.out.println("The constructor is created without an Argumrnt.");
	}
	
	Track(String type){
		this.type = type;
	}
	
	Track(String surfaceMaterial,double lengthMeters){
		this.surfaceMaterial = surfaceMaterial;
		this.lengthMeters = lengthMeters;
	}
	
	Track(int lanes){
		this.lanes = lanes;
	}
	
	Track(boolean floodLights){
		this.floodLights = floodLights;
	}
	
	Track(double lengthMeters,int lanes,boolean floodLights){
		this.lengthMeters = lengthMeters;
		this.lanes = lanes;
		this.floodLights = floodLights;
	}
}