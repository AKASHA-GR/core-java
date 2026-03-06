class Motor{
	String name;
	String brand;
	String model;
	double price;
	double weight;
	Invented invented;//1820
	Material material;
	Current current;
	Magnet magnet;
	Shape shape;
	
	
	Motor(String name,String brand,String model,double price,double weight,Invented invented,Material material,Current current,Magnet magnet,Shape shape){
		this.name = name;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.weight = weight;
		this.invented = invented;
		this.material = material;
		this.current = current;
		this.magnet = magnet;
		this.shape = shape;
	}
	
	void getMotor(){
		System.out.println("The name of the motor:"+this.name);
		System.out.println("The name of the brand:"+this.brand);
		System.out.println("The name of the model:"+this.model);
		System.out.println("The name of the price:"+this.price);
		System.out.println("The name of the weight:"+this.weight);
	}
}