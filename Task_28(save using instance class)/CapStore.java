class CapStore{
	Cap[] cap;
	int curentIndex = 0;
	
	CapStore(Cap[] cap){
		this.cap = cap;
	}
	
	void save(Cap cap){
		System.out.println("The save is exicuting in the CapStore class.");
		
		if(cap!= null && this.cap!= null){
			System.out.println("The cap name and cap array is not null.");
			
			int indexSize = this.cap.length - 1;
			System.out.println("The curent value is store in index:"+this.curentIndex);
			if(curentIndex <= indexSize){
				this.cap[curentIndex] = cap;
				cap.printInfo();
				this.curentIndex++;
				System.out.println("The next value is stored in index:"+this.curentIndex);
			}else{
				System.out.println("The cap array is full.");
			}
		}else{
			System.out.println("The cap name or cap array is null.");
		}
	}
}