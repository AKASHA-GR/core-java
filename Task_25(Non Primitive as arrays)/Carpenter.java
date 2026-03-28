class Carpenter{
	String[] products;
	Wood[] wood;
	
	
	Carpenter(String[] products,Wood[] wood){
		this.products = products;
		this.wood = wood;
	}
	
	void display(){
		
		System.out.println("The display method is exicuting in class carpenter.");
		
		if(this.products != null){
			System.out.println("The totle number of product:"+this.products.length);
			for(String product:this.products){
				System.out.println("The type of wood:"+product);
			}
		}else{
			System.out.println("The products is null.");
		}
		
		
		if(this.wood != null){
			System.out.println("The totle number of woods:"+this.wood.length);
			for(Wood wood:this.wood){
				System.out.println("The type of wood:"+wood.type);
				System.out.println("The price per kg of wood:"+wood.pricePerFoot);
			}
		}else{
			System.out.println("The wood is null.");
		}
		
		
	}
}