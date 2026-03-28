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
}