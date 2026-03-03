/*Declare below classes, then declare least 20 instance variables in every class . One constrcutor in each class,then instance method to display all the variables. Then in the runner create least 10 instances and invoke the method to display Google,
WallPaper,
Pepper,
Paper,
Garlic,
Stand,
Map,
Toxic,
PVR,
Trophy,
DumbBell,
Diabetes,
Brain,
Shampoo,
Conditioner,
Organ,
Cell,
Office,
Lotion,
Organizer,
Education
*/

class Paper{
	
	String brand;
	String type;
	String color;
	String material;
	String finish;
	String texture;
	String usage;
	String manufacturerCountry;
	double length;
	double width;
	double thickness;
	double weight;
	double pricePerPack;
	double brightnessLevel;
	int gsm;
	int sheetsPerPack;
	int quantityInStock;
	int warrantyMonths;
	boolean recycled;
	boolean waterproof;
	
	
	Paper(String brand,String type,String color,String material,String finish,String texture,String usage,String manufacturerCountry,double length,double width,double thickness,double weight,double pricePerPack,double brightnessLevel,int gsm,int sheetsPerPack,int quantityInStock,int warrantyMonths,boolean recycled,boolean waterproof){
		
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.material = material;
		this.finish = finish;
		this.texture = texture;
		this.usage = usage;
		this.manufacturerCountry = manufacturerCountry;
		this.length = length;
		this.width = width;
		this.thickness = thickness;
		this.weight = weight;
		this.pricePerPack = pricePerPack;
		this.brightnessLevel = brightnessLevel;
		this.gsm =gsm;
		this.sheetsPerPack = sheetsPerPack;
		this.quantityInStock = quantityInStock;
		this.warrantyMonths = warrantyMonths;
		this.recycled = recycled;
		this.waterproof = waterproof;
		
	}
	
	void page(){
		
		System.out.println("The brand of the Paper:"+brand);
		System.out.println("The type of the Paper:"+type);
		System.out.println("The color of the Paper:"+color);
		System.out.println("The material of the Paper:"+material);
		System.out.println("The finish of the Paper:"+finish);
		System.out.println("The texture of paper:"+texture);
		System.out.println("The usage of the Paper:"+usage);
		System.out.println("The manufacturerCountry of the Paper:"+manufacturerCountry);
		System.out.println("The length of the Paper:"+length);
		System.out.println("The width of the Paper:"+width);
		System.out.println("The thickness of the Paper:"+thickness);
		System.out.println("The weight of the Paper:"+weight);
		System.out.println("The pricePerPack of the Paper:"+pricePerPack);
		System.out.println("The brightnessLevel of the Paper:"+brightnessLevel);
		System.out.println("The gsm of the Paper:"+gsm);
		System.out.println("The sheetsPerPack of the Paper:"+sheetsPerPack);
		System.out.println("The quantityInStock of the Paper:"+quantityInStock);
		System.out.println("The warrantyMonths of the Paper:"+warrantyMonths);
		System.out.println("The Paper is recycled:"+recycled);
		System.out.println("The paper is waterproof:"+waterproof);
		
		
	}
}
