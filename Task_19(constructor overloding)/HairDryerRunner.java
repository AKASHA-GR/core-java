class HairDryerRunner{
	public static void main(String[] args){
		
		HairDryer hairDryer = new HairDryer();
		System.out.println("The hairDryer brand:" +hairDryer.brand);
		System.out.println("The hairDryer color:" +hairDryer.color);
		System.out.println("The hairDryer speedLevels:" +hairDryer.speedLevels);
		System.out.println("The hairDryer price:" +hairDryer.price);
		System.out.println("The hairDryer hasCoolShot:" +hairDryer.hasCoolShot);
		
		
		
		HairDryer hairDryer1 = new HairDryer("Philips","White");
		System.out.println("The hairDryer brand:" +hairDryer1.brand);
		System.out.println("The hairDryer color:" +hairDryer1.color);
		
		
		HairDryer hairDryer2 = new HairDryer("Dyson","Slive",3);
		System.out.println("The hairDryer brand:" +hairDryer2.brand);
		System.out.println("The hairDryer color:" +hairDryer2.color);
		System.out.println("the hairDryer speedLevels:" +hairDryer2.speedLevels);
		
		
		HairDryer hairDryer3 = new HairDryer(3999,true);
		System.out.println("The hairDryer color;" +hairDryer3.price);
		System.out.println("The hairDryer hascoolshort:" +hairDryer3.hasCoolShot);
		
		
		
		HairDryer hairDryer4 = new HairDryer("Blue",true);
		System.out.println("The hairDryer color:" +hairDryer4.color);
		System.out.println("The hairDryer speedLevels:" +hairDryer4.hasCoolShot);
		
		
		HairDryer hairDryer5 = new HairDryer("Nova",3444.0);
		System.out.println("The hairDryer brand:" +hairDryer5.brand);
		System.out.println("The hairDryer price:" +hairDryer5.price);
		
		
	}

}