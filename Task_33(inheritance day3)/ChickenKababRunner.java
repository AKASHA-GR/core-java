class ChickenKababRunner{
	public static void main(String[] args){
		ChickenKabab chickenKabab = new ChickenKabab();
		System.out.println("The quantity of kabab:"+chickenKabab.quantity);
		System.out.println("The price of kabab:"+chickenKabab.price);
		System.out.println("The location:"+chickenKabab.location);
		System.out.println("");
		
		ChickenKabab chickenKabab1 = new ChickenKabab(1,220,"Bengaluru");
		System.out.println("The quantity of kabab:"+chickenKabab1.quantity);
		System.out.println("The price of the kabab:"+chickenKabab1.price);
		System.out.println("The location:"+chickenKabab1.location);
		System.out.println();
		
		ChickenKabab chickenKabab2 = new ChickenKabab(5,1200);
		System.out.println("The quantity of kabab:"+chickenKabab2.quantity);
		System.out.println("The price of the kabab:"+chickenKabab2.price);
		System.out.println("The location:"+chickenKabab2.location);
		System.out.println();
	}
	
}