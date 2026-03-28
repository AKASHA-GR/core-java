class Aquarium{
	String brand;//AquaEl
	String material;
	String shape;
	double price;
	boolean isBrakable;
	Fish fish;
	Plant plant;
	Quantity quantity;
	AquaStone aquaStone;
	AquaSize aquaSize;
	
	
	Aquarium(String brand,String material,String shape,double price,boolean isBrakable,Fish fish,Plant plant,Quantity quantity,AquaStone aquaStone,AquaSize aquaSize){
		this.brand = brand;
		this.material = material;
		this.shape = shape;
		this.price = price;
		this.isBrakable = isBrakable;
		this.fish = fish;
		this.plant = plant;
		this.quantity = quantity;
		this.aquaStone = aquaStone;
		this.aquaSize = aquaSize;
	}
	
	void getAquarium(){
		System.out.println("The brand of an Aquarium:" +this.brand);
		System.out.println("The material of an Aquarium:" +this.material);
		System.out.println("The shape of an Aquarium:" +this.shape);
		System.out.println("The price of an Aquarium:" +this.price);
		System.out.println("The isBrakable of an Aquarium:" +this.isBrakable);
		
		if(this.fish != null){
			this.fish.getFish();
		}else{
			System.out.println("The fish is not defined...");
		}
		
		if(this.plant != null){
			this.plant.getPlant();
		}else{
			System.out.println("The plant is not defined...");
		}
		
		if(this.quantity != null){
			this.quantity.getQuantity();
		}else{
			System.out.println("The bellTime is not defined...");
		}
		
		if(this.aquaStone != null){
			this.aquaStone.getStone();
		}else{
			System.out.println("The aquaStone is not defined...");
		}
		
		if(this.aquaSize != null){
			this.aquaSize.getAquaSize();
		}else{
			System.out.println("The aquaSize is not defined...");
		}
	}
}