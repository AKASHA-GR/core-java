/*Declare below classes, then declare 5 primitive/String instance variables and 5 non primitive(not string) Total 66 classes and one runner Create one instance of below classes and init/instanit..te all variables using constructor. 
Mouse 
File 
Lion 
Motor 
Coach 
Ipl 
Spa 
Tea 
Bell 
Cloud 
Aquarium
*/


class Mouse{
	String brand;
	String model;
	double rating;
	double price;
	int numberOfMouse;
	Weight weight;
	Rgb rgb;
	Color color;
	Button button;
	Wire wire;
	
	Mouse(String brand,String model,double rating,double price,int numberOfMouse,Weight weight,Rgb rgb,Color color,Button button,Wire wire){
		this.brand = brand;
		this.model = model;
		this.rating = rating;
		this.price = price;
		this.numberOfMouse = numberOfMouse;
		this.weight = weight;
		this.rgb = rgb;
		this.color = color;
		this.button = button;
		this.wire = wire;
		
	}
	
	
	void getMouse(){
		System.out.println("The mouse Brand:"+this.brand);
		System.out.println("The mouse model:"+this.model);
		System.out.println("The mouse rating:"+this.rating);
		System.out.println("The mouse price:"+this.price);
		System.out.println("The numberOfMouse:"+this.numberOfMouse);
		
		
		
		
		if(weight != null){
			this.weight.getWeight();			
		}else{
			System.out.println("there is is not defined...");
		}
		
		if(rgb != null){
			this.rgb.getRgb();
		}else{
			System.out.println("there is is not defined...");
		}
		
		if(color != null){
			this.color.getColor();
		}else{
			System.out.println("there is is not defined...");
		}
		
		if(button != null){
			this.button.getButton();
		}else{
			System.out.println("there is is not defined...");
		}
		
		if(wire != null){
			this.wire.getWire();
		}else{
			System.out.println("there is is not defined...");
		}
	}
	
	
	
}