class Scanner{
	String[] type;
	Brand[] brand;
	
	Scanner(String[] type,Brand[] brand){
		this.type = type;
		this.brand = brand;
	}
	
	void display(){
		System.out.println("The display method is exicuting in the class Scanner.");
		
		if(this.type != null){
			System.out.println("The totle number of typs in Scanner:"+this.type.length);
			for(String type:this.type){
				System.out.println("The type of scanner:"+type);
			}
		}else{
			System.out.println("The type is null.");
		}
		
		
		if(this.brand != null){
			System.out.println("The totle number of brand:" +this.brand.length);
			for(Brand brand1:this.brand){
				brand1.getBrand();
			}
		}else{
			System.out.println("The brand is null.");
		}
	}
}