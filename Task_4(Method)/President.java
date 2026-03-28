// 3.Declare a President class with methods and execute in following sequence govern()-->callState()-->rules()--> check()---> callAdmin()-->collect()--> apply()-->chain()-->citizen()-->follow() Invoke govern() method from main method of another class 

class President{
	static void govern(){
		System.out.println("1.President governs the country.");
		
		callState();
		
	}

	static void callState(){
		System.out.println("2.President calls the state government.");
		
		rules();

	}
	
	static void rules(){
		System.out.println("3.Rules are formed.");
		
		check();
		
	}
	
	static void check(){
		System.out.println("4.Verify the rules.");
		
		callAdmin();
		
	}
	
	static void callAdmin(){
		System.out.println("5.Admin is called by President.");
		
		collect();
		
	}
	
	static void collect(){
		System.out.println("6.Rules are collected by ADmin.");
		
		apply();
		
	}
	
	static void apply(){
		System.out.println("7.Rules are applyed in Socity.");
		
		chain();
		
	}
	
	static void chain(){
		System.out.println("8.This is apply like Chine.");
		
		citizen();
		
	}
	
	static void citizen(){
		System.out.println("9.Citizens are Informed.");
		
		follow();
	}
	
	static void follow(){
		System.out.println("10.Citizens are Followed.");
	}
}