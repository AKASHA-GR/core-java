class Court{
	int numberofCourts;
	Type type;
	State state;
	
	
	Court(int numberofCourts,Type type,State state){
		this.numberofCourts = numberofCourts;
		this.type = type;
		this.state = state;
	}
	
	void printInfo(){
		System.out.println("The numberofCourts:"+this.numberofCourts);
		System.out.println("The state:"+this.state);
		
		if(this.type != null){
			this.type.getType();
		}else{
			System.out.println("The type is null.");
		}
	}
	
}