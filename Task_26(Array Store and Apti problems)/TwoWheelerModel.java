class TwoWheelerModel{
	
	String[] names;
	int currentIndex = 0;
	
	TwoWheelerModel(String[] names){
		this.names = names;
	}
	
	void store(String name){
		System.out.println("The store method exicuting in the class TwoWheelerModel.");
		System.out.println("The TwoWheelerModel Name:"+name);
		
		if(this.names != null){
			
			int indexSize = this.names.length -1;
			System.out.println("The value stored in index:"+this.currentIndex);
			if(currentIndex <= indexSize){
				this.names[currentIndex] = name;
				currentIndex++;
				System.out.println("The next value stored in index:" +this.currentIndex);
			}else{
				System.out.println("The names array is full.");
			}
			
			
		}else{
			System.out.println("The names array is null.");
		}
	}
} 