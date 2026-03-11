class Jamoon{
	double[] price;
	Ingredients[] ingredients;
	
	
	Jamoon(double[] price,Ingredients[] ingredients){
		this.price = price;
		this.ingredients = ingredients;
	}
	
	
	void display(){
		System.out.println("The display method is exicuting in the class jamoon.");
		
		if(this.price != null){
			System.out.println("The totle number of price:"+this.price.length);
			for(double price:this.price){
				System.out.println("The price of Jamoon:"+price);
			}
		}else{
			System.out.println("The price is null.");
		}
		
		
		if(this.ingredients != null){
			System.out.println("The totle number of ingredients:" +this.ingredients.length);
			for(Ingredients ingredients1:this.ingredients){
				ingredients1.getIngredients();
			}
		}else{
			System.out.println("The ingredients is null.");
		}
	}
}