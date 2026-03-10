class WallnutRunner{
	public static void main(String... args){
		
		Variety variety1 = new Variety("General Walnuts");
		Wallnut wallnut1 = new Wallnut(250,variety1,Protein.VERY_LOW);
		wallnut1.printInfo();
		
		
		Variety variety2 = new Variety("General Walnuts");
		Protein protein1 = Protein.HIGH;
		Wallnut wallnut2 = new Wallnut(250,variety2,protein1);
		wallnut2.printInfo();
		
		Variety variety3 = new Variety("General Walnuts");
		Wallnut wallnuty3 = new Wallnut(250,variety3,Protein.LOW);
		wallnuty3.printInfo();
		
		
		Variety variety4 = new Variety("General Walnuts");
		Protein protein2 = Protein.MEDIUM;
		Wallnut wallnut4 = new Wallnut(250,variety2,protein1);
		wallnut4.printInfo();
	}
}