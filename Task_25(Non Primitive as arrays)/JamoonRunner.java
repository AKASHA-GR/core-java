class JamoonRunner{
	public static void main(String[] args){
		
		//double[] price = {10,15,20,25,30};
		
		double[] price = new double[5];
		price[0] = 10;
		price[1] = 15;
		price[2] = 20;
		price[3] = 25;
		price[4] = 30;
		
		Ingredients ingredients1 = new Ingredients("Jamoon flour","Two boule"); 
		Ingredients ingredients2 = new Ingredients("Oil","one letter"); 
		Ingredients ingredients3 = new Ingredients("Suger","one boule"); 
		
		
		Ingredients[] ingredients = new Ingredients[3];
		ingredients[0] = ingredients1;
		ingredients[1] = ingredients2;
		ingredients[2] = ingredients3;
		
		Jamoon jamoon = new Jamoon(price,ingredients);
		jamoon.display();
		
		
	}
}