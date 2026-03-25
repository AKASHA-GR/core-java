class Statue{
	String name;
	int height;
	int weight;
	String location;
	int year;
	String material;
	
	Statue(String name,int height,int weight,String location,int year,String material){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.location = location;
		this.year = year;
		this.material = material;
	}
	
	void printInfo(){
		System.out.println("The printInfo is exicuting on Statue.");
		System.out.println("The name of Statue:"+this.name);
		System.out.println("The height of Statue:"+this.height);
		System.out.println("The weight of Statue:"+this.weight);
		System.out.println("The location of Statue:"+this.location);
		System.out.println("The year of Statue:"+this.year);
		System.out.println("The meterial of Statue:"+this.material);
	}
}