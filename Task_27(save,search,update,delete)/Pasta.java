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
	
	boolean update(int index,String name){
		System.out.println("The update oparation using index and name");
		System.out.println("The update on index:"+index);
		System.out.println("The update on name:"+name);
		
		if(this.brandNames == null){
			System.out.println("The array brandNames is null,it can ont update.");
			return false;
		}else{
			System.out.println("The array brandNames is exist.");
		}
		
		if(name == null){
			System.out.println("The name is null,it can ont update.");
			return false;
		}else{
			System.out.println("The name is not null,state updating the name on given index.");
		}
		
		if(index>0 && index<this.brandNames.length-1){
			this.brandNames[index] = name;
			System.out.println("The name is updated.");
			return true;
		}
		return false;
	}
	
	
	boolean update(String oldName,String newName){
		
		if(this.brandNames == null){
			System.out.println("The array brandNames is null,it can ont update.");
			return false;
		}else{
			System.out.println("The array brandNames is exist.");
		}
		
		if(newName != null){
			System.out.println("The newName is not null.");
			for(String old:this.brandNames){
				System.out.println("Compare with:"+old);
				if(old == null){
					old = newName;
					System.out.println("The name is updated.");
					return true;
			    }
			
				if(old == oldName){
					System.out.println("The name is match.");
					oldName = newName;
					System.out.println("The name is updated.");
					return true;
				
				}
			}
			
		}else{
			System.out.println("The newName is null");
		}
		return false;
	}
	
	
	boolean delete(int index){
		System.out.println("The delete oparation is done using index of an array");
		System.out.println("The index of an array:"+index);
		
		if(this.brandNames != null){
			System.out.println("The brandNames is not null.");
			
			if(index>0 && index<this.brandNames.length - 1){
				this.brandNames[index] = null;
				System.out.println("The name is deleted in array");
				return true;
			}
			
		}else{
			System.out.println("The brandNames is null.");
		}
		return false;
	}
	
	
	boolean delete(String name){
		System.out.println("The delete oparation is done using name of an array");
		System.out.println("The index of an name:"+name);
		
		if(this.brandNames == null){
			System.out.println("The array brandNames is null,it can ont delete.");
			return false;
		}else{
			System.out.println("The array brandNames is exist.");
		}
		
		if(name == null){
			System.out.println("The name is null,it can not delete.");
			return false;
		}else{
			System.out.println("The name is not null,state deleteing the name on array.");
		}
		
		for(String tempname:this.brandNames){
			System.out.println("Comparing with:"+tempname);
			if(tempname == name){
				tempname = null;
				System.out.println("The name is deleted.");
				return false;
			}
		}
		return false;
	}
}