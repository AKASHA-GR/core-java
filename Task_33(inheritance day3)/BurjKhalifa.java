class BurjKhalifa extends Building{
	BurjKhalifa(){
		super("Iron",1000000000,70);
	}
	
	BurjKhalifa(int price,int quantity){
		super("Cement",price,quantity);
	}
	
	BurjKhalifa(int price){
		super("Cement",price,95);
	}
}