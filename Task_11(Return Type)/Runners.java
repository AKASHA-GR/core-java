class Runners{
	public static void main(String[] args){
		
		//Suitcase
		//1
		
		String name = "Akasha";
		String res =Suitcase.getType(name);
		System.out.println("The Suitcase type:" + res);
		System.out.println("");
		name = null;
		res =Suitcase.getType(name);
		System.out.println("The Suitcase type:" + res);
		System.out.println("===========================================");
		
		//2
		
		int getLength;
		getLength = Suitcase.getLength();
		System.out.println("The Suitcase Length:" +getLength);
		System.out.println("===========================================");
		
		//3
		
		String getColor;
		getColor = Suitcase.getColor();
		System.out.println("The Suitcase Color:" +getColor);
		System.out.println("===========================================");
		
		//4
		
		boolean hasLoker;
		hasLoker = Suitcase.hasLoker();
		System.out.println("The Suitcase has Loker:" +hasLoker);
		System.out.println("===========================================");
		
		//5
		double price;
		price = Suitcase.price();
		System.out.println("The Suitcase Price:" +price);
		System.out.println("===========================================");
		System.out.println("");
		System.out.println("");
		
		//Bullet
		//1
		
		String getType;
		getType = Bullet.getType();
		System.out.println("The Type of the Bullet:" +getType);
		System.out.println("====================================");
		
		//2
		
		int speed;
		speed = Bullet.speed();
		System.out.println("The Speed of a Bullet:" +speed);
		System.out.println("====================================");
		
		//3
		
		double weight;
		weight = Bullet.weight();
		System.out.println("The Weight of a Bullet:" +weight);
		System.out.println("====================================");
		
		//4
		
		boolean isAction;
		isAction = Bullet.isAction();
		System.out.println("The Bullet is in Action:" +isAction);
		System.out.println("====================================");
		
		//5
		
		char grade;
		grade = Bullet.grade();
		System.out.println("The Grade of a Bullet:" +grade);
		System.out.println("====================================");
		System.out.println("");
		System.out.println("");
		
		//Fire
		//1
		
		int temparature;
		temparature = Fire.temparature();
		System.out.println("The temparature of Fire:" +temparature);
		System.out.println("====================================");
		
		//2
		
		String color;
		color = Fire.color();
		System.out.println("The color of Fire:" +color);
		System.out.println("====================================");
		
		//3
		double intencity;
		intencity = Fire.intencity();
		System.out.println("The intensity of Fire:" + intencity);
		System.out.println("====================================");
		
		//4
		
		boolean isDangerous;
		isDangerous = Fire.isDangerous();
		System.out.println("The Fire is Dangerous:" +isDangerous);
		System.out.println("====================================");
		
		//5
		
		char level;
		level = Fire.level();
		System.out.println("The Level of Fire:" +level);
		System.out.println("====================================");
		System.out.println("");
		
		
		//Water
		//1
		
		int boilingPoint;
		boilingPoint = Water.boilingPoint();
		System.out.println("The BoilingPoint of a Water is:" +boilingPoint);
		System.out.println("===========================================");
		
		//2
		
		String state;
		state = Water.state();
		System.out.println("The state of a Water:" +state);
		System.out.println("===========================================");
		
		//3
		
		double density;
		density = Water.density();
		System.out.println("The density of a Water:" +density);
		System.out.println("===========================================");
		
		//4
		
		boolean isDrinkable;
		isDrinkable = Water.isDrinkable();
		System.out.println("The Water is Drinkable:" +isDrinkable);
		System.out.println("===========================================");
		
		//5
		
		char purityGrade;
		purityGrade = Water.purityGrade();
		System.out.println("The Water purity Grade is:" +purityGrade);
		System.out.println("===========================================");
		System.out.println("");
		
		//Crown
		//1
		
		int crownweight;
		crownweight = Crown.crownweight();
		System.out.println("The Crown weight is:" +crownweight);
		System.out.println("===========================================");
		
		//2
		
		String material;
		material = Crown.material();
		System.out.println("The Crown material is:"+material);
		System.out.println("===========================================");
		
		//3
		
		double crownPrice;
		crownPrice = Crown.crownPrice();
		System.out.println("The Price of a Crown:" +crownPrice);
		System.out.println("===========================================");
		
		//4
		
		boolean hasDiamonds;
		hasDiamonds = Crown.hasDiamonds();
		System.out.println("The Crown hasDiamonds:" +hasDiamonds);
		System.out.println("===========================================");
		
		//5
		
		char size;
		size = Crown.size();
		System.out.println("The Size of Crown:" +size);
		System.out.println("===========================================");
		System.out.println("");
		
		//Towel
		//1
		
		int towelLength;
		towelLength = Towel.towelLength();
		System.out.println("The Length of an Towel:"+towelLength);
		System.out.println("===========================================");
		
		//2
		
		String towelColor;
		towelColor = Towel.towelColor();
		System.out.println("The Color of a Towel:" +towelColor);
		System.out.println("===========================================");
		
		//3
		
		double thickness;
		thickness = Towel.thickness();
		System.out.println("The thickness of Towel:" +thickness);
		System.out.println("===========================================");
		
		//4
		
		boolean isCotton;
		isCotton = Towel.isCotton();
		System.out.println("Check is Cotton:" +isCotton);
		System.out.println("===========================================");
		
		//5
		
		char quality;
		quality = Towel.quality();
		System.out.println("The quality of Towel:" +quality);
		System.out.println("===========================================");
		System.out.println("");
		
		
		//Ladder
	    //1
		
		int steps;
		steps = Ladder.steps();
		System.out.println("The steps of Ladder:"+steps);
		System.out.println("===========================================");
		
		//2
		
		String LadderMaterial;
		LadderMaterial = Ladder.LadderMaterial();
		System.out.println("The material of Ladder:" +LadderMaterial);
		System.out.println("===========================================");
		
		//3
		
		double hight;
		hight = Ladder.hight();
		System.out.println("The hight of Ladder:" +hight);
		System.out.println("===========================================");
		
		//4
		
		boolean isFoldable;
		isFoldable = Ladder.isFoldable();
		System.out.println("Check is Foldable:" +isFoldable);
		System.out.println("===========================================");
		
		//5
		
		char type;
		type = Ladder.type();
		System.out.println("The quality of Towel:" +type);
		System.out.println("===========================================");
		System.out.println("");
		
		//Banch
		//1
		
		int seatingCapacity;
		seatingCapacity = 
		
		
		
	}
}