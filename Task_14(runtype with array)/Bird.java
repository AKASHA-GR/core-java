class Bird{
	static String getColorByName(String name){
		System.out.println("The Bird name:" +name);
		
		if(name == null){
			System.out.println("The name of the Bird is not declared.");
			return null;
		}
		
		if(name == "Northern Cardinal"){
			return "Vibrant Red";
		}
		
		if(name == "Peacock"){
			return "Blue";
		}
		
		if(name == "Parrot"){
			return "Green";
		}
		
		if(name == "Crow"){
			return "Black";
		}
		
		if(name == "Swan"){
			return "White";
		}
		
		if(name == "KingFisher"){
			return "Blue and Orenge";
		}
		
		if(name == "Flaminngo"){
			return "Pink";
		}
		
		if(name == "Pigen"){
			return "Grey";
		}
		
		if(name == "Sparroww"){
			return "Brown and White";
		}
		
		if(name == "Eagle"){
			return "Brown";
		}
		
		if(name == "Owl"){
			return "Brown and White";
		}
		
		if(name == "Woodpecker"){
			return "Black and White";
		}
		
		if(name == "Penguin"){
			return "Black and White";
		}
		
		if(name == "Canary"){
			return "Yellow";
		}
		
		if(name == "HummingBird"){
			return "Green and Shiny";
		}
		
		if(name == "Macaw"){
			return "Blue and red";
		}
		
		if(name == "Duck"){
			return "Green and Brown";
		}
		
		if(name == "Robin"){
			return "Brown and red";
		}
		
		if(name == "Falcon"){
			return "Grey and Brown";
		}
		
		if(name == "Heron"){
			return "Grey and white";
		}
		
		return null;
	}
	
	static int getLifespanByName(String name){
		System.out.println("The name of the Bird:" +name);
		
		if(name == null){
			System.out.println("The name is not defined.");
			return 0;
		}
		
		if(name == "Northern Cardinal"){
			return 3;
		}
		
		if(name == "Peacock"){
			return 20;
		}
		
		if(name == "Parrot"){
			return 80;
		}
		
		if(name == "Crow"){
			return 15;
		}
		
		if(name == "Swan"){
			return 30;
		}
		
		if(name == "Kingfisher"){
			return 10;
		}
		
		if(name == "Flamingo"){
			return 30;
		}
		
		if(name == "Pigeon"){
			return 15;
		}
		
		if(name == "Sparrow"){
			return 5;
		}
		
		if(name == "Eagle"){
			return 30;
		}
		
		if(name == "Owl"){
			return 25;
		}
		
		if(name == "Woodpecker"){
			return 12;
		}
		
		if(name == "Penguin"){
			return 20;
		}
		
		if(name == "Canary"){
			return 15;
		}
		
		if(name == "Hummingbird"){
			return 5;
		}
		
		if(name == "Macaw"){
			return 50;
		}
		
		if(name == "Duck"){
			return 10;
		}
		
		if(name == "Robin"){
			return 5;
		}
		
		if(name == "Falcon"){
			return 20;
		}
		
		if(name == "Heron"){
			return 25;
		}
		return 0;
	}
}