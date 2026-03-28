class BunRunner {
    public static void main(String[] args) {

        Bun bun1 = new Bun();

        bun1.name = "Burger Bun";
        bun1.type = "Whole Wheat";
        bun1.price = 20.5;
        bun1.weight = 80;
        bun1.shape = "Round";
        bun1.fresh = true;
        bun1.calories = 250;
        bun1.brand = "Britannia";

        bun1.ingredients = new String[]{"Flour", "Yeast", "Salt", "Sugar"};
        bun1.availableCities = new String[]{"Bangalore", "Mysore", "Hubli"};

        System.out.println("Name: " + bun1.name);
        System.out.println("Type: " + bun1.type);
        System.out.println("Price: " + bun1.price);
        System.out.println("Weight: " + bun1.weight);
        System.out.println("Shape: " + bun1.shape);
        System.out.println("Fresh: " + bun1.fresh);
        System.out.println("Calories: " + bun1.calories);
        System.out.println("Brand: " + bun1.brand);

        System.out.println("Ingredients:");
        for(int i=0;i<bun1.ingredients.length;i++){
            System.out.println(bun1.ingredients[i]);
        }

        System.out.println("Available Cities:");
        for(int i=0;i<bun1.availableCities.length;i++){
            System.out.println(bun1.availableCities[i]);
        }
		System.out.println("");
		
		
		
		Bun bun2 = new Bun();
		
		bun2.name = "Sweet Bun";
		bun2.type = "Sweet";
		bun2.price = 28;
		bun2.weight = 200;
		bun2.fresh = false;
		bun2.calories = 298;
		bun2.brand = "Modern";
		
		bun2.ingredients = new String[] {"Wheat flour","sugar","Vegetable fat","Yeast","Salt","milk Solids"};
		
		bun2.availableCities = new String[]{"Bangalore", "Mysore", "Hubli"};
		
		System.out.println("Name: " + bun2.name);
        System.out.println("Type: " + bun2.type);
        System.out.println("Price: " + bun2.price);
        System.out.println("Weight: " + bun2.weight);
        System.out.println("Shape: " + bun2.shape);
        System.out.println("Fresh: " + bun2.fresh);
        System.out.println("Calories: " + bun2.calories);
        System.out.println("Brand: " + bun2.brand);
		
		
        System.out.println("Ingredients:");
        for(int i=0;i<bun1.ingredients.length;i++){
            System.out.println(bun1.ingredients[i]);
        }
		
		System.out.println("Available Cities:");
		for(int i =0; i<bun2.availableCities.length; i++){
			System.out.println(bun2.availableCities[i]);
		}
		
    }
}