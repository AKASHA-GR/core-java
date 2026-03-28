class Fort{
	int builtYear;
	Place place;
	RockType rocktype;
	
	Fort(int builtYear,Place place,RockType rocktype){
		this.builtYear = builtYear;
		this.place = place;
		this.rocktype = rocktype;
	}
	
	void printInfo(){
		System.out.println("The builtYear:"+this.builtYear);
		System.out.println("The rocktype:" +this.rocktype);
		
		if(this.place != null){
			this.place.getPlace();
		}else{
			System.out.println("The place is null.");
		}
	}
	
}