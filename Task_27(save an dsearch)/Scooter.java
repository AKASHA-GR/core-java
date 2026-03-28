class Scooter{
	String[] names;
	int currentIndex = 0;
	
	Scooter(String[] names){
		this.names = names;
	}
	
	void save(String name){
		System.out.println("The save method is exicuting in class Scooter.");
		System.out.println("The Scooter name:"+name);
		
		if(this.names != null){
			int indexSize = this.names.length -1;
			System.out.println("The totle array size:"+indexSize);
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
		System.out.println("The search method is exicuting in class Scooter.");
		System.out.println("The Scooter name:"+name);
		
		if(name != null){
			System.out.println("The name is not null,it can be search");
			
			if(this.names != null){
				System.out.println("The Scooter is not null,it can be search.");
				
				for(String scootername:this.names){
					System.out.println("compare with:"+scootername);
					if(scootername == name){
						return true;
					}
				}
			}else{
				System.out.println("The scootername is null.it can not be search.");
			}
			
		}else{
			System.out.println("The name is null.it can not be search");
		}
		return false;
	}
}