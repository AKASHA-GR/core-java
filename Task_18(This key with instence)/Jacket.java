//Declare Below classes, then declare instance variables as mentioned below. Declare one construtco.. to init all the instanve variables during creation. Create one instance for each class Bangle : 1 Anklet: 1 Coffee: 2 Ant : 3 Bucket: 5 Jacket : 5 Pocket: 3 Cricket: 20 Racket: 10 Helmet: 3 Blanket: 6 Bracelet: 20 Necklace: 20 ShoeLace: 10

class Jacket{
	String brand;
	String model;
    double price;
    int pockets;
    boolean hadZipper;

	Jacket(String brand,String model,double price,int pockets,boolean hadZipper){
		
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.pockets = pockets;
		this.hadZipper = hadZipper;
		
	}
}