//Declare a class Ocean with below method declare a method with 5 parameters and invoke it 3 times

class Ocean{
	static void info(String name,boolean oilRing,int noOfShips,int depth, int noOfVolcanic){
		
		System.out.println("The name of Ocean:" +name);
		System.out.println("There is any oilRing present: " +oilRing);
		System.out.println("The number of Ships:"+ noOfShips);
		System.out.println("The Depth of ocean:"+ depth);
		System.out.println("The number of Volcanic:" +noOfVolcanic);
		System.out.println("");
		
		if(name == null){
			System.out.println("The statement is invalid... Make sure the name is not null!")
			return;
		}
		
		if(oilRing == false){
			System.out println("The statement is invalid... Make sure the oilRing is not false");
			return;
		}
		
		if(noOfShips <=0){
			System.out.println("The Statement is invalid... Make sure the noOfShips is not Zero");
			return;
		}
		
		if(depth <=0){
			System.out.println("The Statement is invalid... Make sure the depth is not Zero");
			return;
		}
		
		if(noOfVolcanic <=0){
			System.out.println("The Statement is invalid... Make sure the noOfVolcanic is not Zero")
		}
	}
}