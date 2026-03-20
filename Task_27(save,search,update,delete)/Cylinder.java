class Cylinder{
	String[] companyNames;
	int currentIndex;
	
	Cylinder(String[] companyNames){
		this.companyNames = companyNames;
	}
	
	void save(String name){
		System.out.println("The name method is exicuting in class name.");
		System.out.println("The CompanyName of Cylinder:"+name);
		
		
		if(this.companyNames != null){
			int indexSize = this.companyNames.length -1;
		    System.out.println("The totle indexSize:"+indexSize);
		    System.out.println("The value is stored in index:"+this.currentIndex);
			
			if(this.currentIndex <= indexSize){
				this.companyNames[currentIndex] = name;
				currentIndex++;
				System.out.println("The next value is stored in index:"+this.currentIndex);
				
			}else{
				System.out.println("The array is full.");
			}
			
		}else{
			System.out.println("The companyNames is null.");
		}
	}
	
	boolean search(String name){
		System.out.println("The search method is exicuting in class Cylinder.");
		System.out.println("The companyName:"+name);
		
		if(name != null){
			System.out.println("The name is not null,it can be search.");
			
			if(this.companyNames != null){
				System.out.println("The companyNames is not null,it can be search.");
				
				for(String tempname:this.companyNames){
					System.out.println("Compare with:"+tempname);
					if(tempname == name){
						return true;
					}
				}
				
			}else{
				System.out.println("The companyNames is null.it can not be search.");
			}
			
		}else{
			System.out.println("The name is null.it can not be search.");
		}
		return false;
	}
	
	
	void update(int index,String name){
		System.out.println("The update oparation using index and name.");
		System.out.println("The index:"+index);
		System.out.println("The name:"+name);
		
		if(this.companyNames == null){
			System.out.println("The array companyNames is null,it can ont update.");
			return;
		}else{
			System.out.println("The array companyNames is exist.");
		}
		
		if(name == null){
			System.out.println("The name is null,it can ont update.");
			return;
		}else{
			System.out.println("The name is not null,state updating the name on given index:index.");
		}
		
		if(index>0 && index<this.companyNames.length-1){
			this.companyNames[index] = name;
			System.out.println("The " +name+" is updated on index:"+index);
			return;
		}
	}
	
	
	boolean update(String oldName,String newName){
		System.out.println("The update oparation using oldName and newName.");
		System.out.println("The oldName:"+oldName);
		System.out.println("The newName:"+newName);
		
		if(this.companyNames == null){
			System.out.println("The array companyNames is null,it can ont update.");
			return false;
		}else{
			System.out.println("The array companyNames is exist.");
		}
		
		if(oldName == null && newName == null){
			System.out.println("The oldName and newName is null,it can ont update.");
			return false;
		}else{
			System.out.println("The oldName and newName is not null,state updating the oldName with newName");
		}
		
		for(String old1:this.companyNames){
			System.out.println(">>>Compating with:"+old1);
			if(old1 == oldName){
				System.out.println("The oldName is found in an array.");
				oldName = newName;
				System.out.println("The name is update as:"+newName);
				return true;
			}else{
				System.out.println("The name is not match in an array.");
			}
		}
		
		return false;
	}
	
	
	boolean delete(int index){
		System.out.println("The delete oparation using only index.");
		System.out.println("The index i have to delete:"+index);
		
		if(this.companyNames == null){
			System.out.println("The companyNames array is null.");
			return false;
		}else{
			System.out.println("The companyNames is not null");
		}
		
		if(index>0 && index<this.companyNames.length-1){
			this.companyNames[index] = null;
			System.out.println("The name is delete on index:"+index);
			return true;
		}else{
			System.out.println("The index is invalid.");
		}
		return false;
	}
	
	
	boolean delete(String name){
		System.out.println("The Delete oparation is done using name.");
		System.out.println("The name:"+name);
		
		if(name == null){
			System.out.println("The name is null.");
			return false;
		}else{
			System.out.println("The name is not null.");
		}
		
		if(this.companyNames == null){
			System.out.println("The companyNames array is null.");
			return false;
		}else{
			System.out.println("The companyNames is not null.");
		}
		
		for(String temp:this.companyNames){
			System.out.println("Comparing with:"+temp);
			if(temp == name){
				temp = null;
				System.out.println("The name is deleted.");
				return true;
			}
		}
		return false;
	}
	
}