class OceanRunner{
	public static void main(String[] args){
		
		String name = "Pacific Ocean";
		boolean oilRing = true;
		int noOfShips = 30000;
		int depth = 4280;
		int noOfVolcanic = 25000;
		
		Ocean.info(name,oilRing,noOfShips,depth,noOfVolcanic);
		
		name = "Atlantic Ocean";
		oilRing = false;
	    noOfShips = 20000;
		depth = 3646;
		noOfVolcanic = 15000;
		
		Ocean.info(name,oilRing,noOfShips,depth,noOfVolcanic);
		
		name = "Indian Ocean";
		oilRing = true;
		noOfShips = 18000;
		depth = 3741;
		noOfVolcanic = 10000;
		
		Ocean.info(name,oilRing,noOfShips,depth,noOfVolcanic);
		
		name = "Southern Ocean";
		oilRing = false;
		noOfShips = 5000;
		depth = 3270;
		noOfVolcanic = 8000;
		
		Ocean.info(name,oilRing,noOfShips,depth,noOfVolcanic);
		
		name = "Arctic Ocean";
		oilRing = true;
		noOfShips = 2000;
		depth = 1205;
		noOfVolcanic = 2500;
		
		Ocean.info(name,oilRing,noOfShips,depth,noOfVolcanic);
		
	}
}