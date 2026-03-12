class Tower{
	String[] name;
	Location[] location;
	
	Tower(String[] name,Location[] location){
		this.name = name;
		this.location = location;
	}
	
	void display(){
		
		if(this.name != null){
			System.out.println("The totle number of Tower name:"+this.name.length);
			for(String name:this.name){
				System.out.println("The name of tower:"+name);
			}
		}else{
			System.out.println("The name is null.");
		}
		
		
		if(this.location != null){
			System.out.println("The totle number of location:" +this.location.length);
			for(Location locations:this.location){
				locations.getLocation();
			}
		}else{
			System.out.println("The location is null.");
		}
	}
}