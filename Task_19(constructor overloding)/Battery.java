//Declare 12 classes with 5 IV, declare 6 constrctors in each class . Create a runner and create 6 instances for each class . Print variables for each instance. Droplet, Umbrella,Rain,Snow,HairDryer,Clip,ChessBoard, Track,Battery,Pawn,Carrom,Strawberry

class Battery{
	String brand;
	String chemistry;
	double voltage;
	int capacitymAh;
	boolean rechargeble;
	
	Battery(){
		System.out.println("The constructor is created without an Argument.");
	}
	
	Battery(String brand){
		this.brand = brand;
	}
	
	Battery(String chemistry,double voltage){
		this.chemistry = chemistry;
		this.voltage = voltage;
	}
	
	Battery(int capacitymAh){
		this.capacitymAh = capacitymAh;
	}
	
	
	Battery(boolean rechargeble){
		this.rechargeble = rechargeble;
	}
	
	Battery(double voltage,int capacitymAh,boolean rechargeble){
		this.voltage = voltage;
		this.capacitymAh = capacitymAh;
		this.rechargeble = rechargeble;
	}
}