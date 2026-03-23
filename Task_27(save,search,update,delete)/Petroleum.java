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
	
	
	 
    void update(int index, String name) {
        System.out.println("Update using index");
        System.out.println("Index: " + index + " Name: " + name);

        if (this.products == null || name == null) {
            System.out.println("Invalid data");
            return;
        }

        if (index >= 0 && index < this.products.length) { 
            this.products[index] = name;
            System.out.println("Updated successfully at index: " + index);
        } else {
            System.out.println("Invalid index");
        }
    }

   
    boolean update(String oldName, String newName) {
        System.out.println("Update using oldName and newName");

        if (this.products == null || oldName == null || newName == null) {
			System.out.println("The oldName or newName or products array is null.");
            return false;
        }

        for (int i = 0; i < products.length; i++) {
            if (oldName.equals(products[i])) { 
                products[i] = newName; 
				System.out.println("The newName is updated.");
                return true;
            }
        }
        return false;
    }

    
    boolean delete(int index) {
        System.out.println("Delete using index");
		System.out.println("The index:"+index);

        if (this.products == null) {
			System.out.println("The products array is null.");
            return false;
        }

        if (index >= 0 && index < this.products.length) { 
            this.products[index] = null;
            return true;
        }
        return false;
    }

   
    boolean delete(String name) {
        System.out.println("Delete using name");
		System.out.println("The name:"+name);

        if (this.products == null || name == null) {
			System.out.println("The name or products array is null.");
            return false;
        }

        for (int i = 0; i < products.length; i++) {
            if (name.equals(products[i])) { 
                products[i] = null;         
                return true;
            }
        }
        return false;
    
}
}