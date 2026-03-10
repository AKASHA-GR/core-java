class DMart{
	int item;
	Location location;
	District district;
	
	
	DMart(int item,Location location,District district){
		this.item = item;
		this.location = location;
		this.district = district;
	}
	
	void printInfo(){
		System.out.println("The totle number of items:"+this.item);
		System.out.println("The district:"+this.district);
		
		if(this.location != null){
			this.location.getLocation();
		}else{
			System.out.println("The location is null.");
		}
	}
	
}