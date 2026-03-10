class DMartRunner{
	
	public static void main(String... args){
		
		Location location1 = new Location("6th main Road");
		DMart dmart1 = new DMart(600000,location1,District.CHITRADURGA);
		dmart1.printInfo();
		
		Location location2 = new Location("3th main Road");
		DMart dmart2 = new DMart(700000,location2,District.BENGALURU);
		dmart2.printInfo();
		
		Location location3 = new Location("6th main Road");
		District district1 = District.TUMATURU;
		DMart dmart3 = new DMart(900000,location3,district1);
		dmart3.printInfo();
		
		Location location4 = new Location("3th main Road");
		District district2 = District.SHIRA;
		DMart dmart4 = new DMart(500000,location4,district2);
		dmart4.printInfo();
	}

}