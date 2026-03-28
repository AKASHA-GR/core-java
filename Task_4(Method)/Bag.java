//2.Declare a Bag class, declare 5 methods . Invoke each from another class without a main method. Invoke methods of another class from main method main()-->AnotherClass.methods()---> Bag.methods()

public class Bag{
	
	static void textbooks() { 
	System.out.println("Bag contains textbooks.");
	} 
	
	 static void notes() {
		System.out.println("Bag contains a notes.");
    }
		
	static void compassbox() { 
	   System.out.println("Bag contains a compassbox."); 
	}

	static void mobile() { 
		System.out.println("Bag contains a mobile."); 
	}
	
	static void laptop() { 
		System.out.println("Bag contains laptop."); 
	} 
}