//Declare 12 classes with 5 IV, declare 6 constrctors in each class . Create a runner and create 6 instances for each class . Print variables for each instance. Droplet, Umbrella,Rain,Snow,HairDryer,Clip,ChessBoard, Track,Battery,Pawn,Carrom,Strawberry

class Pawn{
	String pieceName;
	String position;
	boolean isFirstMove;
	boolean isCaptured;
	int points;
	
	Pawn(){
		System.out.println("The constrctor is created without Argument.");
	}
	
	Pawn(String pieceName){
		this.pieceName = pieceName;
	}
	
	Pawn(String position,boolean isFirstMove){
		this.position = position;
		this.isFirstMove = isFirstMove;
	}
	
	Pawn(boolean isCaptured){
		this.isCaptured = isCaptured;
	}
	
	Pawn(int points){
		this.points = points;
	}
	
	Pawn(String pieceName,boolean isFirstMove,int points){
		this.pieceName = pieceName;
		this.isFirstMove = isFirstMove;
		this.points = points;
	}
}