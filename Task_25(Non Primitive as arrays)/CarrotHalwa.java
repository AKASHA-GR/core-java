class CarrotHalwa{
	String[] size;
	Items[] items;
	
	CarrotHalwa(String[] size,Items[]items){
		this.size = size;
		this.items = items;
	}
	
	
	void display(){
		
		
		if(this.size != null){
			System.out.println("The totle number of Paketsize:"+this.size.length);
			for(String sizes:this.size){
				System.out.println("The size of carrot halwa in grams:"+sizes);
			}
		}else{
			System.out.println("The Packetsize is null");
		}
		
		
		if(this.items != null){
			System.out.println("The totle number of items:"+this.items.length);
			for(Items item:this.items){
				item.getItems();
			} 
			

			}else{
				System.out.println("The item is null.");
		}
	}
	
}