class Pasta{
	String[] brandNames;
	int currentIndex = 0;
	
	Pasta(String[] brandNames){
		this.brandNames = brandNames;
	}
	
	void save(String name){
		System.out.println("The save method is exicuting in class Pasta.");
		System.out.println("The brandName:"+name);
		
		if(this.brandNames != null){
			int indexSize = this.brandNames.length -1;
			System.out.println("The size of an array:"+indexSize);
			System.out.println("The value is stored in index:"+this.currentIndex);
			
			if(currentIndex <= indexSize){
				this.brandNames[currentIndex] = name;
				currentIndex++;
				System.out.println("The next value is stored in index:"+this.currentIndex);
			}else{
				System.out.println("The array is full.");
			}
			
			
		}else{
			System.out.println("The brandNames is null.");
		}
	}	
	
	boolean search(String name){
		System.out.println("The search method is exicuting in class Pasta.");
		System.out.println("The name:"+name);
		
		if(name != null){
			System.out.println("The name is not null,it can be search.");
			
			if(this.brandNames != null){
				System.out.println("The brandNames not null,it can be search.");
				for(String tempname:this.brandNames){
					System.out.println("compare with:"+tempname);
					if(tempname == name){
						return true;
					}
				}
				
			}else{
				System.out.println("The brandNames is null.");
			}
			
		}else{
			System.out.println("The name is null,it can not be search.");
		}
		return false;
	}
}