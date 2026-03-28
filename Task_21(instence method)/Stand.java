class Stand{
	
	String brand;
	String modelName;
	String material;
	String color;
	String standType;
	String shape;
	String finish;
	String usage;
	String manufacturerCountry;
	double height;
	double width;
	double depth;
	double weight;
	double price;
	double maxLoadCapacity;
	int quantityInStock;
	int warrantyYears;
	int durabilityRating;
	boolean foldable;
	boolean adjustable;
	
	Stand(String brand,String modelName,String material,String color,String standType,String shape,String finish,String usage,String manufacturerCountry,double height,double width,double depth,double weight,double price,double maxLoadCapacity,int quantityInStock,int warrantyYears,int durabilityRating,boolean foldable,boolean adjustable){
		
		this.brand = brand;
		this.modelName = modelName;
		this.material = material;
		this.color = color;
		this.standType = standType;
		this.shape = shape;
		this.finish = finish;
		this.usage = usage;
		this.manufacturerCountry = manufacturerCountry;
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.weight = weight;
		this.price = price;
		this.maxLoadCapacity = maxLoadCapacity;
		this.quantityInStock = quantityInStock;
		this.warrantyYears = warrantyYears;
		this.durabilityRating = durabilityRating;
		this.foldable = foldable;
		this.adjustable = adjustable;
		
	}
	
	void right(){
		System.out.println("The brand name of Stand:" +brand);
		System.out.println("The modelName of Stand:" +modelName);
		System.out.println("The material of Stand:" +material);
		System.out.println("The color of Stand:" +color);
		System.out.println("The standType of Stand:" +standType);
		System.out.println("The shape of Stand:" +shape);
		System.out.println("The finish of Stand:" +finish);
		System.out.println("The usage of Stand:" +usage);
		System.out.println("The manufacturerCountry of Stand:" +manufacturerCountry);
		System.out.println("The height of Stand:" +height);
		System.out.println("The width of Stand:" +width);
		System.out.println("The depth of Stand:" +depth);
		System.out.println("The weight of Stand:" +weight);
		System.out.println("The price of Stand:" +price);
		System.out.println("The maxLoadCapacity of Stand:" +maxLoadCapacity);
		System.out.println("The quantityInStock of Stand:" +quantityInStock);
		System.out.println("The warrantyYears of Stand:" +warrantyYears);
		System.out.println("The durabilityRating of Stand:" +durabilityRating);
		System.out.println("The foldable of Stand:" +foldable);
		System.out.println("The adjustable of Stand:" +adjustable);
	}
}