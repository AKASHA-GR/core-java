class FortRunner{
	public static void main(String... args){
		
		Place place1 = new Place("Delhi");
		Fort fort1 = new Fort(1639,place1,RockType.WATER);
		fort1.printInfo();
		
		Place place2 = new Place("Agra");
		Fort fort2 = new Fort(1565,place2,RockType.DESERT);
		fort2.printInfo();
		
		
		Place place3 = new Place("Madhya Pradesh");
		RockType rocktype1 = RockType.EARTHEN;
		Fort fort3 = new Fort(1639,place3,rocktype1);
		fort3.printInfo();
		
		Place place4 = new Place("Bengaluru");
		RockType rocktype2 = RockType.HUMAN_BUILT;
		Fort fort4 = new Fort(1565,place4,rocktype2);
		fort4.printInfo();
	}
}