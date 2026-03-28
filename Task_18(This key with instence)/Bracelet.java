//Declare Below classes, then declare instance variables as mentioned below. Declare one construtco.. to init all the instanve variables during creation. Create one instance for each class Bangle : 1 Anklet: 1 Coffee: 2 Ant : 3 Bucket: 5 Jacket : 5 Pocket: 3 Cricket: 20 Racket: 10 Helmet: 3 Blanket: 6 Bracelet: 20 Necklace: 20 ShoeLace: 10

class Bracelet{
	String brand;
	String material;
	String color;
	double price;
	double weight;
	String size;
	String type;
	boolean adjustable;
	String design;
	String claspType;
	String stoneType;
	int stoneCount;
	boolean isGoldPlated;
	String originCountry;
	String shape;
	double length;
	double width;
	String finish;
	boolean waterproof;
	String warranty;
	
	Bracelet(String brand,
		String material,
		String color,double price,
		double weight,
		String size,
		String type,
		boolean adjustable,
		String design,
		String claspType,
		String stoneType,
		int stoneCount,
		boolean isGoldPlated,
		String originCountry,
		String shape,
		double length,
		double width,
		String finish,
		boolean waterproof,
		String warranty){
		
		this.brand = brand;
		this.material = material;
		this.color = color;
		this.price = price;
		this.weight = weight;
		this.size = size;
		this.type = type;
		this.adjustable = adjustable;
		this.design = design;
		this.claspType = claspType;
		this.stoneType = stoneType;
		this.stoneCount = stoneCount;
		this.isGoldPlated = isGoldPlated;
		this.originCountry = originCountry;
		this.shape = shape;
		this.length = length;
		this.width = width;
		this.finish = finish;
		this.waterproof = waterproof;
		this.warranty = warranty;
		
	}
}