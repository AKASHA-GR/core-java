class SingerNames{
	
	String[] names;
	int currentIndex = 0;
	
	SingerNames(String[] names){
		this.names = names;
	}
	
	void store(String name){
		System.out.println("The store method is exicuting in class SingerNames.");
		System.out.println("The Singer Name:" +name);
		
		if(this.names != null){
			
			int checkIndex = this.names.length - 1;
			System.out.println("The value stored in the index:"+this.currentIndex);
			if(this.currentIndex <= checkIndex){
				this.names[currentIndex] = name;
				currentIndex++;
				System.out.println("The next index to store the value:"+this.currentIndex);
			}else{
				System.out.println("The names array is full.");
			}
			
		}else{
			System.out.println("The names array is null or not there.");
		}
	}

}