class BreadRunner{
	public static void main(String[] args){
		
		Bread bread = new Bread();
		
		bread.type = "Whole Wheat Bread";
		bread.outletNames = new String[] {"Britannia Industries","Harvest Gold","Modern Foods"};
		bread.ingredients = new String[] {"Whole wheat flour","Water","Yeast","Salt","Sugar","Vegetable oil"};
		bread.shape = "Rectangular loaf";
		
		System.out.println("The type of bread:" +bread.type);
		System.out.println("The shape of bread:" +bread.shape);
		
		for(int i=0; i < bread.outletNames.length; i++){
			System.out.println("The outletNames list:" +bread.outletNames[i]);
		}
		
		for(int i=0; i < bread.ingredients.length; i++){
			System.out.println("The ingredients list:" +bread.ingredients[i]);
		}
System.out.println("");
		
		
		
		Bread bread1 = new Bread();
		
		bread1.type = "Whole Wheat Bread";
		bread1.outletNames = new String[] {"Britannia Industries","Harvest Gold","Modern Foods"};
		bread1.ingredients = new String[] {"Whole wheat flour","Water","Yeast","Salt","Sugar","Vegetable oil"};
		bread1.shape = "Rectangular loaf";
		
		System.out.println("The type of bread:" +bread1.type);
		System.out.println("The shape of bread:" +bread1.shape);
		
		for(int i=0; i < bread1.outletNames.length; i++){
			System.out.println("The outletNames list:" +bread1.outletNames[i]);
		}
		
		for(int i=0; i < bread1.ingredients.length; i++){
			System.out.println("The ingredients list:" +bread1.ingredients[i]);
		}		
	}
}