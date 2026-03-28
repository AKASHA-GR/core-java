class Petroleum{
	String[] products;
	int currentIndex = 0;
	
	Petroleum(String[] products){
		this.products = products;
	}
	
	void save(String name){
		System.out.println("The save method is exicuting in class Petroleum.");
		System.out.println("The Product name:"+name);
		
		if(this.products != null){
			int indexSize = this.products.length -1;
			System.out.println("The totle array size:"+indexSize);
			System.out.println("The current value is stored in index:"+this.currentIndex);
			
			if(currentIndex <= indexSize){
				this.products[currentIndex] = name;
				currentIndex++;
				System.out.println("The next value is stored in index:"+this.currentIndex);
			}else{
				System.out.println("The array is full.");
			}
		}else{
			System.out.println("The products is null.");
		}
	}
	
	boolean search(String name){
		System.out.println("The search method is exicuting in class Petroleum.");
		System.out.println("The Product name:"+name);
		
		if(name != null){
			System.out.println("The name is not null,it can be search");
			
			if(this.products != null){
				System.out.println("The products is not null,it can be search.");
				
				for(String productname:this.products){
					System.out.println("compare with:"+productname);
					if(productname == name){
						return true;
					}
				}
			}else{
				System.out.println("The products is null.it can not be search.");
			}
			
		}else{
			System.out.println("The name is null.it can not be search");
		}
		return false;
	}
}