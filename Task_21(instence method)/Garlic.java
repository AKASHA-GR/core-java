class Garlic{
	String name;
	String variety;
	String color;
	String originCountry;
	String flavorProfile;
	String sizeCategory;
	String cultivationType;
	String harvestSeason;
	double weight;
	double pricePerKg;
	double bulbDiameter;
	double coloveCount;
	double moistureContent;
	double sulfurContent;
	int quantityInStock;
	int shelfLifeDays;
	int pungencyLevel;
	boolean organic;
	boolean fresh;
	boolean peeled;
	
	
	Garlic(String name,String variety,String color,String originCountry,String flavorProfile,String sizeCategory,String cultivationType,String harvestSeason,double weight,double pricePerKg,double bulbDiameter,double coloveCount,double moistureContent,double sulfurContent,int quantityInStock,int shelfLifeDays,int pungencyLevel,boolean organic,boolean fresh,boolean peeled){
		
		this.name = name;
		this.variety = variety;
		this.color = color;
		this.originCountry = originCountry;
		this.flavorProfile = flavorProfile;
		this.sizeCategory = sizeCategory;
		this.cultivationType = cultivationType;
		this.harvestSeason = harvestSeason;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
		this.bulbDiameter = bulbDiameter;
		this.coloveCount = coloveCount;
		this.moistureContent = moistureContent;
		this.sulfurContent = sulfurContent;
		this.quantityInStock = quantityInStock;
		this.shelfLifeDays = shelfLifeDays;
		this.pungencyLevel = pungencyLevel;
		this.organic = organic;
		this.fresh = fresh;
		this.peeled = peeled;
	}
	
	void ground(){
		System.out.println("The name of Ginger:"+name);
		System.out.println("The variety of Ginger:"+variety);
		System.out.println("The color of Ginger:"+color);
		System.out.println("The originCountry of Ginger:"+originCountry);
		System.out.println("The flavorProfile of Ginger:"+flavorProfile);
		System.out.println("The sizeCategory of Ginger:"+sizeCategory);
		System.out.println("The cultivationType of Ginger:"+cultivationType);
		System.out.println("The harvestSeason of Ginger:"+harvestSeason);
		System.out.println("The weight of Ginger:"+weight);
		System.out.println("The pricePerKg of Ginger:"+pricePerKg);
		System.out.println("The bulbDiameter of Ginger:"+bulbDiameter);
		System.out.println("The cloveCount of Ginger:"+coloveCount);
		System.out.println("The moistureContent of Ginger:"+moistureContent);
		System.out.println("The sulfurContent of Ginger:"+sulfurContent);
		System.out.println("The quantityInStock of Ginger:"+quantityInStock);
		System.out.println("The shelfLifeDays of Ginger:"+shelfLifeDays);
		System.out.println("The pungencyLevel of Ginger:"+pungencyLevel);
		System.out.println("The Ginger is organic:"+name);
		System.out.println("The Ginger is fresh:"+name);
		System.out.println("The Ginger is peeled:"+name);
	}
}