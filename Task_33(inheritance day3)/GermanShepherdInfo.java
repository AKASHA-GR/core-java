class GermanShepherdInfo extends GermanShepherd{
	
	GermanShepherdInfo(){
		super("Shankar",5,48000);
	}
	
	GermanShepherdInfo(String name,int age,double price){
		super(name,age,price);
	}
	
	GermanShepherdInfo(String name,double price){
		super(name,7,price);
	}
}