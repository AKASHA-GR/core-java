class Market{
	static void product(String name, int cost, double profit){
		
		System.out.println("The name of Product:" +name);
		System.out.println("The cost of product:" +cost);
		System.out.println("The profit of product" +profit);
		
		if(name == null){
			System.out.println("The Statement is invalid... Make sure the name is not null");
			return;
		}
		
		if(cost <=0){
			System.out.println("The Statement is invalid... Make sure the cost is not Zero");
			return;
		}
		
		if(profit <=0){
			System.out.println("The Statement is invalid... Make sure the profit is not Zero");
			return;
		}
	}
	
	static void product(String productionLocation){
		System.out.println("The Location of the Product:" +productionLocation);
		
		if(productionLocation == null){
			System.out.println("The statement is invalid... Make sure the productionLocation is not Zero");
		}
	}
}
