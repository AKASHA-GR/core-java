class Hammer{
	String[] meterial;
	HammerType[] hammerType;
	
	Hammer(String[] meterial,HammerType[] hammerType){
		this.meterial = meterial;
		this.hammerType = hammerType;
	}
	
	void display(){
		System.out.println("The display method is exicuting in the class hammer.");
		
		
		if(this.meterial != null){
			System.out.println("The totle number of meterial:"+this.meterial.length);
			for(String meterial:this.meterial){
				System.out.println("The meterial of hammer:"+meterial);
			}
		}else{
			System.out.println("The meterial is null.");
		}
		
		
		if(this.hammerType != null){
			System.out.println("The totle number of type of hammer:"+this.hammerType.length);
			for(HammerType hammerType:this.hammerType){
				hammerType.getHammerType();
			}
		}else{
			System.out.println("The hammer type is null.");
		}
	}
}