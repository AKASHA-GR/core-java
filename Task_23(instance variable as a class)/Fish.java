class Fish{
	String fishName;
	String type;
	
	Fish(String fishName,String type){
		this.fishName = fishName;
		this.type = type;
	}
	
	void getFish(){
		System.out.println("The fishName:"+this.fishName);
		System.out.println("The fish type:"+this.type);
	}
}