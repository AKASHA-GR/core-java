class Pen{
	static void write(String name,int cost){
		
		System.out.println("The name of Pen:"+name);
		System.out.println("The cost of Pen:" +cost);
		
		if(name == null){
		System.out.println("The Statement is invalid... Make sure the name is not null");
		return;
		}
		
		if(cost <= 0){
		System.out.println("The Statement is invalid... Make sure the cost is not Zero");
		return;
		}
	}
	
	static void write(boolean brand){
		
		System.out.println("The Brand of Pen:"+brand);
		
		if(brand == false){
		System.out.println("The Statement is invalid... Make sure the brand is not false");
		return;
		}
		
	} 
}