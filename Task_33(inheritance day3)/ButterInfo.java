class ButterInfo extends Butter{
	
	ButterInfo(){
		super(500.0,750,"Nandini");
	}
	
	ButterInfo(double quantity,double price,String brand){
		super(quantity,price,brand);
	}
	
	ButterInfo(double price,String brand){
		super(500.0,price,brand);
	}
}