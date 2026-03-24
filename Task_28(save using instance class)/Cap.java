class Cap{
	String brand;
	String brandlogo;
	String color;
	double price;
	String cloth;
	boolean isWaterproof;
	
	Cap(String brand,String brandlogo,String color,double price,String cloth,boolean isWaterproof){
		this.brand = brand;
		this.brandlogo = brandlogo;
		this.color = color;
		this.price = price;
		this.cloth = cloth;
		this.isWaterproof = isWaterproof;
	}
	
	
	void printInfo(){
		System.out.println("The priintInfo is exicuting in class Cap.");
		System.out.println("The brand name:"+this.brand);
		System.out.println("The brand logo:"+this.brandlogo);
		System.out.println("The cap color:"+this.color);
		System.out.println("The cap price:"+this.price);
		System.out.println("The cap cloth:"+this.cloth);
		System.out.println("The cap is waterproof:"+this.isWaterproof);
	}
	
	
}