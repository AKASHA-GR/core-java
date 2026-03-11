class Ingredients{
	String name;
	String quantity;
	
	Ingredients(String name,String quantity){
		this.name = name;
		this.quantity = quantity;
	}
	
	void getIngredients(){
		System.out.println("The ingreadient name:"+this.name);
		System.out.println("The ingreadient quantity:"+this.quantity);
	}
}