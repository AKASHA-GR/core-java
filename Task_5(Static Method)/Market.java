/* 2. Declare Market class, write methods to store and print
 a. storeVegetables 
 b. storeGroceris 
 c. storeFruits 
 d. storeDryFruits 
 e. storeJunkFood 
 Invoke above method from a class call it as Delivery with method pickUp(); 
 Invoke pickUp from another class call it as Customer with method shopping(); 
 Invoke shopping from another class call it as Owner with method buy(); 
 Invoke buy() from another class call it as Person with method fun(); Invoke fun from main()
*/

class Market{
	static void storeVegetables(){
		//declare a variables
		String vegetableName="Tomato";
		System.out.println(">>>List of Vegetables:");
		System.out.println("1." + vegetableName);
		
		vegetableName="Potato";
		System.out.println("2." + vegetableName);
		
		vegetableName="Onion";
        System.out.println("3." + vegetableName);

		vegetableName="Carrot";
		System.out.println("4." + vegetableName);
		
		vegetableName="Cabbage";
		System.out.println("5." + vegetableName);
		
		vegetableName="Cauliflower";
		System.out.println("6." + vegetableName);
		
		vegetableName="Brinjal";
		System.out.println("7." + vegetableName);
		
		vegetableName="Spinach";
		System.out.println("8." + vegetableName);
		
		vegetableName="Beans";
		System.out.println("9." + vegetableName);
		
		vegetableName="Capsicum";
		System.out.println("10." + vegetableName);
	}
	
	static void storeGroceris(){
		//declare a variables
		String grocerisName="Rice";
		System.out.println(">>>List of Groceris:");
		System.out.println("1." + grocerisName);
		
		grocerisName="Wheat Flour";
		System.out.println("2." + grocerisName);
		
		grocerisName="Sugar";
		System.out.println("3." + grocerisName);
		
		grocerisName="Salt";
		System.out.println("4." + grocerisName);
		
		grocerisName="Cooking Oil";
		System.out.println("5." + grocerisName);
		
		grocerisName="Tur Dal";
		System.out.println("6." + grocerisName);
		
		grocerisName="Moong Dal";
		System.out.println("7." + grocerisName);
		
		grocerisName="Chana Dal";
		System.out.println("8." + grocerisName);
		
		grocerisName="Tea Powder";
		System.out.println("9." + grocerisName);
		
		grocerisName="Coffee";
		System.out.println("10." + grocerisName);
	}
	
	static void storeFruits(){
		//declare a variables
		String fruiteName="Apple";
		System.out.println(">>>List of Fruites:");
		System.out.println("1." + fruiteName);
		
		fruiteName="Banana";
		System.out.println("2." + fruiteName);
		
		fruiteName="Mango";
		System.out.println("3." + fruiteName);
		
		fruiteName="Orange";
		System.out.println("4." + fruiteName);
		
		fruiteName="Grapes";
		System.out.println("5." + fruiteName);
		
		fruiteName="Papaya";
		System.out.println("6." + fruiteName);
		
		fruiteName="Pineapple";
		System.out.println("7." + fruiteName);
		
		fruiteName="Watermelon";
		System.out.println("8." + fruiteName);
		
		fruiteName="Pomegranate";
		System.out.println("9." + fruiteName);
		
		fruiteName="Guava";
		System.out.println("10." + fruiteName);
	}	
	
	static void storeDryFruits(){
		//declare a variables
		String dryfruitName="Almonds";
		System.out.println(">>>List of Dry Fruits Name:");
		System.out.println("1." + dryfruitName);
		
		dryfruitName="Cashew Nuts";
		System.out.println("2." + dryfruitName);
		
		dryfruitName="Raisins";
		System.out.println("3." + dryfruitName);
		
		dryfruitName="Pistachios";
		System.out.println("4." + dryfruitName);
		
		dryfruitName="Walnuts";
		System.out.println("5." + dryfruitName);
		
		dryfruitName="Dates";
		System.out.println("6." + dryfruitName);
		
		dryfruitName="Dry Figs";
		System.out.println("7." + dryfruitName);
		
		dryfruitName="Pine Nuts";
		System.out.println("8." + dryfruitName);
		
		dryfruitName="Fox Nuts";
		System.out.println("9." + dryfruitName);
		
		dryfruitName="Apricots";
		System.out.println("10." + dryfruitName);
	}
	
	static void storeJunkFood(){
		String junkName="Pizza";
		System.out.println(">>>List of Junk Food:");
		System.out.println("1." + junkName);
		
		junkName="Burger";
		System.out.println("2." + junkName);
		
		junkName="French Fries";
		System.out.println("3." + junkName);
		
		junkName="Noodles";
		System.out.println("4." + junkName);
		
		junkName="Momos";
		System.out.println("5." + junkName);
		
		junkName="Chips";
		System.out.println("6." + junkName);
		
		junkName="Chocolate";
		System.out.println("7." + junkName);

		junkName="Soft Drinks";
		System.out.println("8." + junkName);
		
		junkName="Ice Cream";
		System.out.println("9." + junkName);
		
		junkName="Donuts";
		System.out.println("10." + junkName);
		
	}
}