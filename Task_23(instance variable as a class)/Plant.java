class Plant{
	String plantName;
	String type;
	
	Plant(String plantName,String type){
		this.plantName = plantName;
		this.type = type;
	}
	
	void getPlant(){
		System.out.println("The plant Name:"+this.plantName);
		System.out.println("The plant type:"+this.type);
	}
}