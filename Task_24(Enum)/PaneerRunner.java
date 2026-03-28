class PaneerRunner{

	public static void main(String... args){
		
		Packet packet1 = new Packet(500,"Vacuum Pack");
		Paneer paneer1 = new Paneer("Amul",packet1,PaneerType.FRESH);
		paneer1.printInfo();
		
		Packet packet2 = new Packet(250,"Plastic Pack");
		Paneer paneer2 = new Paneer("Nandini",packet2,PaneerType.MALAI);
		paneer2.printInfo();
		
		Packet packet3 = new Packet(500,"Vacuum Pack");
		PaneerType paneertype1 = PaneerType.ORGANIC;
		Paneer paneer3 = new Paneer("Milky Mist",packet3,paneertype1);
		paneer3.printInfo();
		
		Packet packet4 = new Packet(200,"Box Pack");
		PaneerType paneertype2 = PaneerType.LOW_FAT;
		Paneer paneer4 = new Paneer("Heritage",packet4,paneertype2);
		paneer4.printInfo();
		
		System.out.println("");
	}
}