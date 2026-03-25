class Tollgate{
	String location;
	double price;
	int numberOfRoads;
	int starteYear;
	boolean hadVipSection;
	boolean hadFastTag;
	
	Tollgate(String location,double price,int numberOfRoads,int starteYear,boolean hadVipSection,boolean hadFastTag){
		this.location = location;
		this.price = price;
		this.numberOfRoads = numberOfRoads;
		this.starteYear = starteYear;
		this.hadVipSection = hadVipSection;
		this.hadFastTag = hadFastTag;
	}
	
	void printInfo(){
		System.out.println("The printInfo is exicuting in class Tollgate.");
		System.out.println("The place of Tollgate:"+location);
		System.out.println("The cost of Tollgate:"+price);
		System.out.println("The numberOfRoads in Tollgate:"+numberOfRoads);
		System.out.println("The starteYear of Tollgate:"+starteYear);
		System.out.println("The hadVipSection:"+hadVipSection);
		System.out.println("The hadFastTag:"+hadFastTag);
	}
}