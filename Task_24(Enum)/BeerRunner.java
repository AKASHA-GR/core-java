class BeerRunner{
	
	public static void main(String... args){
		
		BBottle bbottle1 = new BBottle(650,"Large Bottle");
		Beer beer1 = new Beer("United Breweries",bbottle1,Brand.KINGFISHER);
		beer1.printInfo();
		
		BBottle bbottle2 = new BBottle(500,"Medium Bottle");
		Beer beer2 = new Beer("AB InBev",bbottle2,Brand.BUDWEISER);
		beer2.printInfo();
		
		BBottle bbottle3 = new BBottle(330,"Small Bottle");
		Brand brand1 = Brand.CORONA;
		Beer beer3 = new Beer("Grupo Modelo",bbottle3,brand1);
		beer3.printInfo();
		
		BBottle bbottle4 = new BBottle(500,"Medium Bottle");
		Brand brand2 = Brand.HEINEKEN;
		Beer beer4 = new Beer("Heineken Company",bbottle4,brand2);
		beer4.printInfo();
		
		System.out.println("");
	}
}