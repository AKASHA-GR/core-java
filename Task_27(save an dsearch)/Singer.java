class Singer{
	String[] names;
	int currentIndex = 0;
	
	Singer(String[]names){
		this.names = names;
	}
	
	void save(String name){
		System.out.println("The save method is exicuting in the class Singer.");
		System.out.println("The Singer name:"+name);
		
		if(this.names != null){
			int indexSize = this.names.length -1;
			System.out.println("The sixe of array:"+indexSize);
			System.out.println("The current value is stored in index:"+this.currentIndex);
			
			if(currentIndex <= indexSize){
				this.names[currentIndex] = name;
				currentIndex++;
				System.out.println("The next value is stored in index:"+this.currentIndex);
			}else{
				System.out.println("The array is full.");
			}
		}else{
			System.out.println("The names is null.");
		}
	}
	
	
	boolean search(String name){
		System.out.println("The search method is exicuting in the class Singer.");
		System.out.println("The Singer name:"+name);
		
		if(name != null){
			System.out.println("The name is not null,it can be search.");
			
			if(this.names != null){
				System.out.println("The names is not null,it can be search.");
				
				for(String tempname:this.names){
					System.out.println("Compare with:"+tempname);
					if(tempname == name){
						return true;
					}
				}
				
			}else{
				System.out.println("The names is null,it can not be search.");
			}
			
		}else{
			System.out.println("The name is null,it can not be search.");
		}
		return false;
	}
}