class Pepper{
	
	String name;
	String veriety;
	String color;
	String originCountry;
	String flavorProfile;
	String shape;
	String category;
	String harvestSeason;
	double weight;
	double pricePerKg;
	double length;
	double diameter;
	double moistureContent;
	double scovilleHeatUnit;
	int quantityInStock;
	int shelfLifeDays;
	int spiceLevel;
	boolean organic;
	boolean fresh;
	boolean dried;
	
	
	Pepper(String name,String veriety,String color,String originCountry,String flavorProfile,String shape,String category,String harvestSeason,double weight,double pricePerKg,double length,double diameter,double moistureContent,double scovilleHeatUnit,int quantityInStock,int shelfLifeDays,int spiceLevel,boolean organic,boolean fresh,boolean dried){
	
	this.name = name;
	this.veriety = veriety;
	this.color = color;
	this.originCountry = originCountry;
	this.flavorProfile = flavorProfile;
	this.shape = shape;
	this.category = category;
	this.harvestSeason = harvestSeason;
	this.weight = weight;
	this.pricePerKg = pricePerKg;
	this.length = length;
	this.diameter = diameter;
	this.moistureContent = moistureContent;
	this.scovilleHeatUnit = scovilleHeatUnit;
	this.quantityInStock = quantityInStock;
	this.shelfLifeDays = shelfLifeDays;
	this.spiceLevel = spiceLevel;
	this.organic = organic;
	this.fresh = fresh;
	this.dried = dried;
	}
	
	
	void spicy(){
		System.out.println("The name of the pepper:"+name);
		System.out.println("The veriety of the pepper:"+veriety);
		System.out.println("The color of the pepper:"+color);
		System.out.println("The originCountry of pepper:"+originCountry);
		System.out.println("The flavorProfile of pepper:"+flavorProfile);
		System.out.println("The shape of pepper:"+shape);
		System.out.println("The category of pepper:"+category);
		System.out.println("The harvestSeason of pepper:"+harvestSeason);
		System.out.println("The weight of pepper:"+weight);
		System.out.println("The pricePerKg of pepper:"+pricePerKg);
		System.out.println("The length of pepper:"+length);
		System.out.println("The diameter of papper:"+diameter);
		System.out.println("The moistureContent of pepper:"+moistureContent);
		System.out.println("The secovilleHeatUnit of pepper:"+scovilleHeatUnit);
		System.out.println("The quantityInStock of pepper:" +quantityInStock);
		System.out.println("The shelfLifeDays of pepper:"+shelfLifeDays);
		System.out.println("The spiceLevel of pepper:" +spiceLevel);
		System.out.println("The pepper is organic:"+organic);
		System.out.println("The pepper is fresh:" +fresh);
		System.out.println("The pepper is dried:" +dried);
		
	}
} 