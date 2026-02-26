//Declare Below classes, then declare instance variables as mentioned below. Declare one construtco.. to init all the instanve variables during creation. Create one instance for each class Bangle : 1 Anklet: 1 Coffee: 2 Ant : 3 Bucket: 5 Jacket : 5 Pocket: 3 Cricket: 20 Racket: 10 Helmet: 3 Blanket: 6 Bracelet: 20 Necklace: 20 ShoeLace: 10

class Racket{
	String brand;
	String model;
	String sportType;
	double weight;
	double length;
	String gripSize;
	String stringType;
	double headSize;
	double price;
	String color;
	
	Racket(String brand,String model,String sportType,double weight,double lenght,String gripSize,String stringType,double headSize, double price,String color){
		this.brand = brand;
		this.model = model;
		this.sportType = sportType;
		this.weight = weight;
		this.length = length;
		this.gripSize = gripSize;
		this.stringType = stringType;
		this.headSize = headSize;
		this.price = price;
		this.color = color;
	}
}