class CarpenterRunner{
	public static void main(String... args){
		
		String[] products = {"chairs", "tables", "beds"};
		
		Wood wood1 = new Wood("Teak Wood",6000);
		Wood wood2 = new Wood("Oak Wood",3000);
		Wood wood3 = new Wood("Walnut Wood",4500);
		
		Wood[] wood = new Wood[3];
		wood[0] = wood1;
		wood[1] = wood2;
		wood[2] = wood3;
		
		Carpenter carpanter = new Carpenter(products,wood);
		carpanter.display();
		
	}
	
	
}