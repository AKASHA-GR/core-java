class Turbine{
	String[] names;
	int currentIndex;
	
	Turbine(String[] names){
		this.names = names;
	}
	
	void save(String name){
		System.out.println("The save method is exicuting in class Turbine.");
		System.out.println("The name:"+name);
		
		
		if(this.names != null){
			int indexSize = this.names.length -1;
			System.out.println("The size:"+indexSize);
			System.out.println("The value is stored in index:"+this.currentIndex);
			if(currentIndex <= indexSize){
				this.names[currentIndex] = name;
				currentIndex++;
				System.out.println("The next value is stored in index:"+this.currentIndex);
			}else{
				System.out.println("The array is full.");
			}
			
		}else{
			System.out.println("The names is null. ");
		}
	}
	
	boolean search(String name){
		System.out.println("The search method is exicuting in class Turbine.");
		System.out.println("The name is to fined:"+name);
		
		if(name != null){
			System.out.println("The name is not null,it can be search.");
			
			if(this.names != null){
				System.out.println("The names is not null.it can be search.");
				
				for(String tempname:this.names){
					System.out.println("Compare with :"+tempname);
					if(tempname == name){
						return true;
					}
				}
				
			}else{
				System.out.println("The names is null.it can not be search.");
			}
			
		}else{
			System.out.println("The name is null,it can not be search");
		}
		return false;
	}
	
	
	
	boolean update(int index,String name){
		System.out.println("The update method is exicuting in class Turbine.");
		System.out.println("The name:"+name);
		System.out.println("The index:"+index);
		
		
		if(name != null){
			System.out.println("The name is not null,it can be uptade.");
			
			if(this.names != null){
				System.out.println("The names is not null,it can be update");
				
				if(index>0 && index<this.names.length-1){
					this.names[index] = name;
					System.out.println("The name is updated:"+name);
					return true;
				}
				else{
					System.out.println("index is invalid");
				}
				
			}else{
				System.out.println("The names is null.");
			}
			
			
		}else{
			System.out.println("The name is null,it can not be update.");
		}
		return false;
	}
	
	boolean update(String oldName,String newName){
		
		System.out.println("The update method is exicuting in class Turbine.");
		System.out.println("The oldName:"+oldName);
		System.out.println("The newName:"+newName);
		
		
		if(oldName != null){
			System.out.println("The name is not null,it can be uptade.");
			
			if(this.names != null){
				System.out.println("The names is not null,it can be update");
				
				for(String old:this.names){
					if(old == oldName){
						oldName = newName;
						System.out.println("The name is update");
						return true;
					}
				}
				
			}else{
				System.out.println("The names is null.");
			}
			
			
		}else{
			System.out.println("The oldName is null,it can not be update.");
		}
		return false;
		
	}
	
	
	boolean delete(int index){
		System.out.println("The delete method is exicuting in class Turbine.");
		System.out.println("Delete by index oparation.");
		System.out.println("The index:"+index);
		
		if(this.names != null){
				System.out.println("The names is not null,it can be delete");
				
				if(index>0 && index<this.names.length-1){
					this.names[index] = null;
					System.out.println("The name is delete:"+index);
					return true;
				}
				else{
					System.out.println("index is invalid");
				}
				
			}else{
				System.out.println("The names is null.");
			}
		return false;
	}
	
	
	  String delete(String name){
        System.out.println("Delete method is exicuting in the class Turbine.");
        System.out.println("Delete by Name oparation.");

        if(this.names != null){
            if(name != null){
                int index = 0;

                for(String value:this.names){
                    System.out.println("Checking index " + index + ": " + value);

                    if(value == name){
						System.out.println("The name is match.delete the name:"+value);
                        
                        this.names[index] = null;

                        System.out.println("Deleted '" + name + "' from index: " + index);
						return null;
                    }else{
						System.out.println("name not match. Delete failed.");
					}
                    index++;
                }    
            }else
				{
					System.out.println("Given name is null. Cannot delete.");
				}
		}else
			{
				System.out.println("Array is null. Cannot delete.");
			}
		return null;
    }
}