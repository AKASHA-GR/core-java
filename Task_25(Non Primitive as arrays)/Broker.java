class Broker{
	String[] name;
	House[] house;
	
	Broker(String[] name,House[] house){
		this.name = name;
		this.house = house;
	}
	
	void display(){
		System.out.println("The display method is exicuting in the class broker.");
		
		if(this.name != null){
			System.out.println("The totle number of names:"+this.name);
			for(String name:this.name){
				System.out.println("The name of Broker:"+name);
			}
		}else{
			System.out.println("The name is null.");
		}
		
		
		if(this.house != null){
			System.out.println("The totle number of house:"+this.house.length);
			for(House house:this.house){
				house.getHouse();
			}
		}else{
			System.out.println("The house is null.");
		}
	}
}