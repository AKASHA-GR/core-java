class HammerType{
	String type;
	double weight;
	
	HammerType(String type,double weight){
		this.type = type;
		this.weight = weight;
	}
	
	void getHammerType(){
		System.out.println("The type of hammer:"+this.type);
		System.out.println("The weight of hammer:"+this.weight);
	}
}