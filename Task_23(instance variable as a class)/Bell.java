class Bell{
	String type;
	String material;
	boolean automitic;
	double weight;
	double height;
	Price price;
	Sound sound;
	BellTime bellTime;
	Frequency frequency;
	FindPlace findPlace;
	
	Bell(String type,String material,boolean automitic,double weight,double height,Price price,Sound sound,BellTime bellTime,Frequency frequency,FindPlace findPlace){
		this.type = type;
		this.material = material;
		this.automitic = automitic;
		this.weight = weight;
		this.height = height;
		this.price =price;
		this.sound = sound;
		this.bellTime = bellTime;
		this.frequency = frequency;
		this.findPlace = findPlace;
	}
	
	void getBell(){
		System.out.println("The type of the bell:" +this.type);
		System.out.println("The material of the bell:" +this.material);
		System.out.println("The automitic of the bell:" +this.automitic);
		System.out.println("The weight of the bell:" +this.weight);
		System.out.println("The height of the bell:" +this.height);
		if(this.price != null){
			this.price.getPrice();
		}else{
			System.out.println("The price is not defined...");
		}
		
		if(this.sound != null){
			this.sound.getSound();
		}else{
			System.out.println("The sound is not defined...");
		}
		
		if(this.bellTime != null){
			this.bellTime.getBellTime();
		}else{
			System.out.println("The bellTime is not defined...");
		}
		
		if(this.frequency != null){
			this.frequency.getFrequency();
		}else{
			System.out.println("The frequency is not defined...");
		}
		
		if(this.findPlace != null){
			this.findPlace.getFindPlace();
		}else{
			System.out.println("The findPlace is not defined...");
		}
		
	}
	
}