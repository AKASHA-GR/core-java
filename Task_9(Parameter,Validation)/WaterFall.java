//Declare a class WaterFall , declare two static methods 1. info with 4 parameters and invoke it 5 times 2. stateOwningInfo with 5 parameters and invoke it 5 times

class WaterFall{
	static void info(String name, String brithPlase,int hight, String endPlase){
		
		System.out.println("The WaterFall name:" +name);
		System.out.println("The WaterFall Brithplase:" +brithPlase);
		System.out.println("The Hight of the WaterFall:" +hight);
		System.out.println("The endPlase of the WaterFall:" +endPlase);
		System.out.println("");
	
	
		if(name == null){
				System.out.println("The statement is invalid... Make sure the name is not null!")
				return;
			}
			
		if(brithPlase == null){
			System.out.println("The statement is invalid... Make sure the brithPlase is not null!")
			return;
		}
		
		if(hight <=0){
			System.out.println("The statement is invalid... Make sure the hight is not Zero!")
			return;
		}
		
		if(endPlase == null){
				System.out.println("The statement is invalid... Make sure the endPlase is not null!")
				return;
		}
	}

	
	static void stateOwningInfo(String stateName, String capital, String chiefMinister,long population, int area){
		
		System.out.println("The name of State:" + stateName);
		System.out.println("The name of Capital" + capital);
		System.out.println("The name of Chief Minister:" +chiefMinister);
		System.out.println("The population of State:" +population);
		System.out.println("The area of State:" +area);
		System.out.println("");
		
		if(stateName == null){
			System.out.println("The statement is invalid... Make sure the name is not null!");
			return;
		}
		
		if(capital == null){
			System.out.println("The Statement is invalid... Make sure the capital is not nill!");
			return;
		}
		
		if(chiefMinister == null){
			System.out.println("The Statement is invalid... Make sure the chiefMinister is not nill!");
			return;
		}
		
		if(population <=0){
			System.out.println("The Statement is invalid... Make sure the population is not zreo!");
			return;
		}
		
		if(area <=0){
			System.out.println("The Statement is invalid... Make sure the area is not zreo!");
			return;
		}
	}
}