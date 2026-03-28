class Wallpaper{
	String brand;
	String meterial;
	String color;
	String pattern;
	String texture;
	String finish;
	String theme;
	String roomType;
	String countryOfOrigin;
	double price;
	double width;
	double height;
	double weight;
	double rollLength;
	double coverageArea;
	int quantityInStock;
	int warrantyYears;
	int durabilityRating;
	boolean washable;
	boolean waterproof;
	
	
	Wallpaper(String brand,String meterial,String color,String pattern,String texture,String finish,String theme,String roomType,String countryOfOrigin,double price,double width,double height,double weight,double rollLength, double coverageArea,int quantityInStock,int warrantyYears,int durabilityRating,boolean washable,boolean waterproof){
		
		this.brand = brand;
		this.meterial = meterial;
		this.color = color;
		this.pattern = pattern;
		this.texture =texture;
		this.finish = finish;
		this.theme = theme;
		this.roomType = roomType;
		this.countryOfOrigin = countryOfOrigin;
		this.price = price;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.rollLength =rollLength;
		this.coverageArea = coverageArea;
		this.quantityInStock = quantityInStock;
		this.warrantyYears = warrantyYears;
		this.durabilityRating = durabilityRating;
		this.washable = washable;
		this.waterproof = waterproof;
		
	}
	
	
	void wall(){
		System.out.println("The wallpaper brand name:"+brand);
		System.out.println("The wallpaper meterial:"+meterial);
		System.out.println("The wallpaper color:"+color);
		System.out.println("The wallpaper pattern:"+pattern);
		System.out.println("The wallpaper tectur:" +texture);
		System.out.println("The wallpaper finish:"+finish);
		System.out.println("The wallpaper theme:" +theme);
		System.out.println("The wallpaper roomType:" +roomType);
		System.out.println("The wallpaper countryOfOrigin:" +countryOfOrigin);
		System.out.println("The wallpaper price:" +price);
		System.out.println("The wallpaper width:" +width);
		System.out.println("The wallpaper height:" +height);
		System.out.println("The wallpaper weight:" +weight);
		System.out.println("The wallpaper rollLength:" +rollLength);
		System.out.println("The wallpaper coverageArea:" +coverageArea);
		System.out.println("The wallpaper quantityInStock:" +quantityInStock);
		System.out.println("The wallpaper warrantyYears:" +warrantyYears);
		System.out.println("The wallpaper durabilityRating:" +durabilityRating);
		System.out.println("The wallpaper washable:" +washable);
		System.out.println("The wallpaper waterproof:" +waterproof);
	}
}

