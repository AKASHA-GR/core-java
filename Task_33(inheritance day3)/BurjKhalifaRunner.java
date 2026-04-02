class BurjKhalifaRunner{
	public static void main(String[] args){
		BurjKhalifa burjKhalifa1 = new BurjKhalifa();
		System.out.println("Material:"+burjKhalifa1.material);
		System.out.println("Price:"+burjKhalifa1.price);
		System.out.println("Quantity:"+burjKhalifa1.quantity);
		System.out.println("");
		
		BurjKhalifa burjKhalifa2 = new BurjKhalifa(1500000000,89);
		System.out.println("Material:"+burjKhalifa2.material);
		System.out.println("Price:"+burjKhalifa2.price);
		System.out.println("Quantity:"+burjKhalifa2.quantity);
		System.out.println("");
		
		BurjKhalifa burjKhalifa3 = new BurjKhalifa(1800000000);
		System.out.println("Material:"+burjKhalifa3.material);
		System.out.println("Price:"+burjKhalifa3.price);
		System.out.println("Quantity:"+burjKhalifa3.quantity);
		System.out.println("");
		
		
	}
}