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
	
	
	
	
    void update(int index, String name) {
        System.out.println("Update using index");
		System.out.println("The index:"+index);
		System.out.println("The name:"+name);

        if (this.names == null || name == null) {
            System.out.println("The name or names array is null.");
            return;
        }

        if (index >= 0 && index < this.names.length) { 
            this.names[index] = name;
            System.out.println("Updated at index: " + index);
        } else {
            System.out.println("Invalid index");
        }
    }

    
    boolean update(String oldName, String newName) {
        System.out.println("Update using oldName and newName");
		System.out.println("The oldName:"+oldName);
		System.out.println("The newName:"+newName);

        if (this.names == null || oldName == null || newName == null) {
			System.out.println("The oldName or newName or names array is null.");
            return false;
        }

        for (int i = 0; i < names.length; i++) {
            if (oldName == names[i]) { 
                names[i] = newName;  
				System.out.println("The name is updated.");
                return true;
            }
        }
        return false;
    }

    
    boolean delete(int index) {
        System.out.println("Delete using index");
		System.out.println("The index:"+index);

        if (this.names == null) {
			System.out.println("The names array is null.");
            return false;
        }

        if (index >= 0 && index < this.names.length) {
            this.names[index] = null;
            return true;
        }
        return false;
    }

    
    boolean delete(String name) {
        System.out.println("Delete using name");
		System.out.println("The name:"+name);

        if (this.names == null || name == null) {
			System.out.println("The name or names array is null.");
            return false;
        }

        for (int i = 0; i < names.length; i++) {
            if (name == names[i]) { 
                names[i] = null;         
                return true;
            }
        }
        return false;
    }
}