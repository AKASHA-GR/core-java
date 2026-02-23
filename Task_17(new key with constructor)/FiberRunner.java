class FiberRunner{
	public static void main(String[] args){
		
	Fiber fiber1 = new Fiber();
	
	fiber1.name = "Cotton Fiber";
	fiber1.length = 25;
	fiber1.vendors = new String[]{"Vardhman Textiles","Arvind Limited","Welspum India"};
	
	System.out.println("The fiber name:" +fiber1.name);
	System.out.println("The length of fiber in mm:" +fiber1.length);
	for(int i=0;i<fiber1.vendors.length; i++){
		System.out.println("The venders list:" +fiber1.vendors[i]);
	}
	System.out.println("");
	
	
	Fiber fiber2 = new Fiber();
	
	fiber2.name = "Optical Fiber";
	fiber2.length = 50;
	fiber2.vendors = new String[] {"Corning Inc","Sterlite Technologies","Prysmian Group"};
	
	System.out.println("The fiber name:" +fiber2.name);
	System.out.println("The length of fiber in mm:" +fiber2.length);
	for(int i=0;i<fiber2.vendors.length; i++){
		System.out.println("The venders list:" +fiber2.vendors[i]);
	}
	System.out.println("");
	
	}
	
}