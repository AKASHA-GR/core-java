class  PetroleumCompany{
	String[] names;
	int currentIndex = 0;
	
	PetroleumCompany(String[] names){
		this.names = names;
	}
	
	void save(String name){
		System.out.println("The save method is exicuting in class PetroleumCompany.");
		System.out.println("The name:" +name);
		
		if(this.names != null){
			
			int indexSize = this.names.length -1;
			System.out.println("The value stored in the index:"+this.currentIndex);
			
			if(this.currentIndex <= indexSize){
				this.names[currentIndex] = name;
				currentIndex++;
				System.out.println("The next value is store in this index:"+this.currentIndex);
			}else{
				System.out.println("The array is full.");
			}
			
			
		}else{
			System.out.println("The array called names is null.");
		}
	}
}