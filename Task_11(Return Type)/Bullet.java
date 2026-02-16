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

class Bullet{
	
	static String getType(){
		System.out.println("Exicuting the getType Method in Bullet.");
		return "6mm";
	}
	
	static int speed(){
		System.out.println("Exicuting the speed Method in Bullet.");
		return 580;
	}
	
	static double weight(){
		System.out.println("Exicuting the Weight Method in Bullet.");
		return 5.7;
	}
	
	static boolean isAction(){
		System.out.println("Exicuting the isAction Method in Bullet.");
		return true;
	}
	
	static char grade(){
		System.out.println("Exicuting the Grade Method in Bullet.");
		return 'B';
	}
}