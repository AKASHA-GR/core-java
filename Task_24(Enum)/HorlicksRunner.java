class HorlicksRunner{

	public static void main(String... args){
		
		Bottle bottle1 = new Bottle(500,"Large");
		Horlicks horlicks1 = new Horlicks("Horlicks", bottle1, Flavor.CLASSIC);
		horlicks1.printInfo();
		
		Bottle bottle2 = new Bottle(250,"Medium");
		Horlicks horlicks2 = new Horlicks("Horlicks", bottle2, Flavor.CHOCOLATE);
		horlicks2.printInfo();
		
		Bottle bottle3 = new Bottle(500,"Large");
		Flavor flavor1 = Flavor.ELACHI;
		Horlicks horlicks3 = new Horlicks("Horlicks", bottle3, flavor1);
		horlicks3.printInfo();
		
		Bottle bottle4 = new Bottle(250,"Small");
		Flavor flavor2 = Flavor.JUNIOR;
		Horlicks horlicks4 = new Horlicks("Horlicks", bottle4, flavor2);
		horlicks4.printInfo();
		
		System.out.println("");
	}
}