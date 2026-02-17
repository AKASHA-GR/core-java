class SwitchCase{
	public static void main(String[] args){
		byte month = 12;
		switch(month){
			case 1:
			System.out.println("Janvary");
			break;
			
			case 2:
			System.out.println("February");
			break;
			
			case 3:
			System.out.println("March");
			break;
			
			case 4:
			System.out.println("April");
			break;
			
			case 12:
			System.out.println("December");
			break;
			
			default:
			System.out.println("The DataInvalid...");
			break;
		}
		
		String friut = "Pinaple";
		switch(friut){
			case "Papaya":
			System.out.println("I had a Papaya.");
			break;
			
			case "JackFriut":
			System.out.println("I had a JackFriut.");
			break;
			
			case "Pinaple":
			System.out.println("I had a Pinaple");
			break;
			
			case "WaterMilon":
			System.out.println("I had a WaterMilon.");
			break;
			
			default:
			System.out.println("I had a Friut But i forgot which one.");
			break;
		}
		
		char vitamin = "B";
		switch(vitamin){
			case "A":
			System.out.println("I Have Vitamin A in mybody.");
			break;
			
			case "B":
			System.out.println("I Have Vitamin B in mybody.");
			break;
			
			case "C":
			System.out.println("I Have Vitamin C in mybody.");
			break;
			
			case "D":
			System.out.println("I Have Vitamin D in myboby.");
			break;
			
			case "K":
			System.out.println("I Have Vitamin K in myboby.");
			break;
			
			default:
			System.out.println("I Have Vitamins in MyBoby");
			break;
		}
		
		int count = 4;
		switch(count){
			case 1:
			System.out.println("one");
			break;
			
			case 2:
			System.out.println("Two");
			break;
			
			case 3:
			System.out.println("Three");
			break;
			
			case 4:
			System.out.println("Four");
			break;
			
			default:
			System.out.println("other");
			break;
		}
		
	class ShortSwitch{
	public static void main(String[] args){
		shortAge(20);
	}
	static void shortAge(int age)
	{
		switch(age){
			case 10:
			System.out.println("Age of the person is equal to 10");
			break;
			
			case 20:
			System.out.println("Age of the person is equal to 20");
			break;
			
			case 30:
			System.out.println("Age of the person is equal to 30");
			break;
			
			case 40:
			System.out.println("Age of the person is equal to 40");
			break;
			
			case 50:
			System.out.println("Age of the person is equal to 50");
			break;
			
			default:System.out.println("Age of the person is other than the above value");
			break;
		}
	}
}
	}
}