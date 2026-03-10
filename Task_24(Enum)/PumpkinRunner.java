class PumpkinRunner{
	public static void main(String... args){

		Weight weight1 = new Weight(3);
		Pumpkin pumpkin1 = new Pumpkin(130,weight1,Species.ORANGE);
		pumpkin1.printInfo();
		
		Weight weight2 = new Weight(5);
		Pumpkin pumpkin2 = new Pumpkin(160,weight2,Species.WHITE);
		pumpkin2.printInfo();
		
		
		Weight weight3 = new Weight(7);
		Species species1 = Species.GREEN;
		Pumpkin pumpkin3 = new Pumpkin(220,weight3,species1);
		pumpkin3.printInfo();
		
		Weight weight4 = new Weight(2);
		Species species2 = Species.BLUE;
		Pumpkin pumpkin4 = new Pumpkin(90,weight4,species2);
		pumpkin4.printInfo();
	}
}