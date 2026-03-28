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

class Water{
	
	static int boilingPoint(){
		System.out.println("Exicuting the boilingPoint method in Water.");
		return 100;
	}
	
	static String state(){
		System.out.println("Exicuting the state method in Water.");
		return "Liquid";
	}
	
	static double density(){
		System.out.println("Exicuting the dencity method in Water.");
		return 1.0;
	}
	
	static boolean isDrinkable(){
		System.out.println("Exicuting the isDrinkable method in Water.");
		return true;
	}
	
	static char purityGrade(){
		System.out.println("Exicuting the purityGrade method in Water.");
		return 'A';
	}
}