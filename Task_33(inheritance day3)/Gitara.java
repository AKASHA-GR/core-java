class Gitara extends MusicInstrument{
	
	Gitara(){
		super("String",3500,6);
	}
	
	Gitara(double price){
		super("String",price,6);
	}
	
	Gitara(double price,int quantity){
		super("String",price,quantity);
	}
}