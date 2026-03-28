//Declare 12 classes with 5 IV, declare 6 constrctors in each class . Create a runner and create 6 instances for each class . Print variables for each instance. Droplet, Umbrella,Rain,Snow,HairDryer,Clip,ChessBoard, Track,Battery,Pawn,Carrom,Strawberry

class ChessBoard{
	String material;
	String colorPattern;
	double price;
	int boardSize;
	double weightKG;
	
	ChessBoard(){
		System.out.println("The constrctor is created without an Argument.");
	}
	
	ChessBoard(String material){
		this.material = material;
	}
	
	ChessBoard(String material,String colorPattern){
		this.material = material;
		this.colorPattern = colorPattern;
	}
	
	ChessBoard(double price){
		this.price = price;
	}
	
	ChessBoard( int boardSize){
		this.boardSize = boardSize;
	}
	
	ChessBoard(String material,double weightKG){
		this.material = material;
		this.weightKG = weightKG;
	}
}