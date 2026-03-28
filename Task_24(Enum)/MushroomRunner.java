class MushroomRunner{
	
	public static void main(String... args){
		
		Pack pack1 = new Pack(200,"Small Pack");
		Mushroom mushroom1 = new Mushroom("FreshFarm",pack1,MType.BUTTON);
		mushroom1.printInfo();
		
		Pack pack2 = new Pack(500,"Medium Pack");
		Mushroom mushroom2 = new Mushroom("FreshFarm",pack2,MType.OYSTER);
		mushroom2.printInfo();
		
		Pack pack3 = new Pack(300,"Small Pack");
		MType mtype1 = MType.SHIITAKE;
		Mushroom mushroom3 = new Mushroom("OrganicFarm",pack3,mtype1);
		mushroom3.printInfo();
		
		Pack pack4 = new Pack(700,"Large Pack");
		MType mtype2 = MType.PORTOBELLO;
		Mushroom mushroom4 = new Mushroom("OrganicFarm",pack4,mtype2);
		mushroom4.printInfo();
		
		System.out.println("");
	}
}