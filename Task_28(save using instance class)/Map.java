class Map{
	
	String location;
	int numberOfRoads;
	int numberOfHotles;
	boolean hadCourt;
	int numberOfBusStand;
	int numbeOfRever;
	
	Map(String location,int numberOfRoads,int numberOfHotles,boolean hadCourt,int numberOfBusStand,int numbeOfRever){
		this.location = location;
		this.numberOfRoads = numberOfRoads;
		this.numberOfHotles = numberOfHotles;
		this.hadCourt = hadCourt;
		this.numberOfBusStand = numberOfBusStand;
		this.numbeOfRever = numbeOfRever;
	}
	
	void printInfo(){
		System.out.println("The printInfo is exicuting on the map class.");
		System.out.println("The location:"+location);
		System.out.println("The numberOfRoads:"+numberOfRoads);
		System.out.println("The numberOfHotles:"+numberOfHotles);
		System.out.println("The hadCourt:"+hadCourt);
		System.out.println("The numberOfBusStand:"+numberOfBusStand);
		System.out.println("The numbeOfRevers:"+numbeOfRever);
	}
}