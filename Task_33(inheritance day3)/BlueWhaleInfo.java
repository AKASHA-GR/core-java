class BlueWhaleInfo extends BlueWhale{
	
	BlueWhaleInfo(){
		super(15,"Indian Ocean",true);
	}
	
	BlueWhaleInfo(int age,String location){
		super(age,location,true);
	}
	
	BlueWhaleInfo(int age,String location,boolean isDangerous){
		super(age,location,isDangerous);
	}
}