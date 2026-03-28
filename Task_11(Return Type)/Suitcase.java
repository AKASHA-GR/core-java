/*Write 5 methods in each class with a value returned . Invoke each method in a runner 
  Suitcase 
  Bullet 
  Fire 
  Water 
  Crown 
  Towel 
  Ladder 
  Bench 
  Tablet 
  Grenade 
  Stabilizer
*/

class Suitcase{
	static String getType(String name){
		
		System.out.println("The name of the Suitcase:" +name);
		
		if(name == null){
			System.out.println("The statement is invalid...,");
			String str = "Not defineed.";
			return str;
		}
		return "Is Defined.";
	}
	
	static int getLength(){
		System.out.println("Exicuting the getLength method in Suitcase.");
		return 22;
	}
	
	static String getColor(){
		System.out.println("Exicuting the getColer method in Suitcase.");
		return "SkyBlue.";
	}
	
	static boolean hasLoker(){
		System.out.println("Exicuting the hasLooker method in Suitcase.");
		return true;
	}
	
	static double price(){
		System.out.println("Exicuting the price method in Suitcase.");
		return 1500.00;
	}
}  



