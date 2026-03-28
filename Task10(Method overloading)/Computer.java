class Computer{
	static void device(String name,int storage,boolean madeInIndia){
		
		System.out.println("The Name of Device:" + name);
		System.out.println("The Storage of a Device:" +storage);
		System.out.println("It is Make in India:" +madeInIndia);
		System.out.println("");
		
		if(name == null){
			System.out.println("The statement is invalid... Make sure the name is not null");
			return;
		}
		
		if(storage <=0 ){
			System.out.println("The statement is invalid... Make sure the storage is not null");
			return;
		}
		
		if(madeInIndia == false ){
			System.out.println("The statement is invalid... Make sure the madeInIndia is not null");
			return;
		}
		
	}
	
	static void device(String companyName,int price){
		
		System.out.println("The Company Name of Device:");
		System.out.println("The price of the Device:" +price);
		
		if(companyName == null ){
			System.out.println("The statement is invalid... Make sure the companyName is not null");
			return;
		}
		
		if(price <=0 ){
			System.out.println("The statement is invalid... Make sure the price is not null");
			return;
		}
	}
}