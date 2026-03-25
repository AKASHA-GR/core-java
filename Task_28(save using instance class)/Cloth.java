class Cloth{
	String type;
	double price;
	String color;
	String quality;
	int qunatity;
	boolean isWaterproof;
	
	Cloth(String type,double price,String color,String quality,int qunatity,boolean isWaterproof){
		this.type = type;
		this.price = price;
		this.color = color;
		this.quality = quality;
		this.qunatity = qunatity;
		this.isWaterproof = isWaterproof;
	}
	
	void printInfo(){
		System.out.println("The printInfo is exicuting in class cloth");
		System.out.println("The type name:"+type);
		System.out.println("The price:"+price);
		System.out.println("The color:"+color);
		System.out.println("The quality:"+quality);
		System.out.println("The qunatity:"+qunatity);
		System.out.println("The isWaterproof:"+isWaterproof);
	}
	
}