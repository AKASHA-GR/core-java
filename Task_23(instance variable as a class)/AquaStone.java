class AquaStone{
	String stoneName;
	String type;
	
	AquaStone(String stoneName,String type){
		this.stoneName = stoneName;
		this.type = type;
	}
	
	void getStone(){
		System.out.println("The stoneName:"+this.stoneName);
		System.out.println("The stone type:"+this.type);
	}	
}