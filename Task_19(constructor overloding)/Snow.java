//Declare 12 classes with 5 IV, declare 6 constrctors in each class . Create a runner and create 6 instances for each class . Print variables for each instance. Droplet, Umbrella,Rain,Snow,HairDryer,Clip,ChessBoard, Track,Battery,Pawn,Carrom,Strawberry

class Snow{
	String season;
	String type;
	double snowfallCM;
	double temparature;
	int duration;
	
	Snow(){
		System.out.println("The constructor is created without the Argument.");
	}
	
	Snow(String season,String type,double snowfallCM,double temparature,int duration){
		this.season = season;
		this.type = type;
		this.snowfallCM = snowfallCM;
		this.temparature = temparature;
		this.duration = duration;
	}
	
	Snow(String season){
		this.season = season;
	}
	
	Snow(String type,double snowfallCM){
		this.type = type;
		this.snowfallCM = snowfallCM;
	}
	
	Snow(double temparature){
		this.temparature = temparature;
	}
	
	Snow(int duration){
		this.duration = duration;
	}

}