class Food{
	static void eat(String nameOfFood,String type,int costOfFood){
		
		System.out.println("The Name of Food:" +nameOfFood);
		System.out.println("The Type of Food:" +type);
		System.out.println("The Cost of Food:" +costOfFood);
		
		if(nameOfFood == null){
			System.out.println("The Statement is invalid... Make sure the nameOfFood is not null");
			return;
		}
		
		if(type <=0){
			System.out.println("The Statement is invalid... Make sure the type is not Zero");
			return;
		}
		
		if(costOfFood == null){
			System.out.println("The Statement is invalid... Make sure the costOfFood is not null");
			return;
		}
	}
	
	
	static void eat(String brithPlace, boolean isNeed){
		
		System.out.println("The brithPlace of Food:" +brithPlace);
		System.out.println("The Food is Needed:" +isNeed);
		
		if(brithPlace == null){
		System.out.println("The Statement is invalid... Make sure the brithPlace is not null");
		return;
		
		}
		
		if(isNeed == false){
		System.out.println("The Statement is invalid... Make sure the isNeed is not null");
		return;
		
		}
		
	}
	
}