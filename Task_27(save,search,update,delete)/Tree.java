class Tree{
	String[] names;
	int currentIndex = 0;
	
	Tree(String[] names){
		this.names = names;
	}
	
	void save(String name){
		System.out.println("The save method is exicuting in the class Tree.");
		System.out.println("The Tree name:"+name);
		
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
		System.out.println("The search method is exicuting in the class Tree.");
		System.out.println("The Tree name:"+name);
		
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
	
	
	
	
	
    void update(int index, String name) {
        System.out.println("Update using index");

        if (this.names == null || name == null) {
            System.out.println("Invalid data");
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

        if (this.names == null || oldName == null || newName == null) {
            return false;
        }

        for (int i = 0; i < names.length; i++) {
            if (oldName.equals(names[i])) { 
                names[i] = newName;         
                return true;
            }
        }
        return false;
    }

    
    boolean delete(int index) {
        System.out.println("Delete using index");

        if (this.names == null) {
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

        if (this.names == null || name == null) {
            return false;
        }

        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) { 
                names[i] = null;         
                return true;
            }
        }
        return false;
    }

	
}