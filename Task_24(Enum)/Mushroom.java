class Mushroom{
	String brand;
	Pack pack;
	MType mtype;
	
	
	Mushroom(String brand, Pack pack, MType mtype){
		this.brand = brand;
		this.pack = pack;
		this.mtype = mtype;
	}
	
	void printInfo(){
		System.out.println("The mushroom brand: " + this.brand);
		
		if(this.pack != null){
			this.pack.getPack();
		}else{
			System.out.println("The pack is null.");
		}
		
		System.out.println("The mushroom type: " + this.mtype);
	}
}