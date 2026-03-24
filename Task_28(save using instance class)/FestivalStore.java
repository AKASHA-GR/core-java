class FestivalStore{
	Festival[] festival;
	int currentindex = 0;
	
	FestivalStore(Festival[] festival){
		this.festival = festival;
	}
	
	void save(Festival festival){
		System.out.println("The save oparation is exicuting in class Festival.");
		
		if(this.festival != null && festival != null){
			System.out.println("The festival or festival array is not null.");
			int indexSize = this.festival.length - 1;
			System.out.println("The current value stored in index:"+this.currentindex);
			if(currentindex <= indexSize){
				this.festival[currentindex] = festival;
				festival.printInfo();
				this.currentindex++;
				System.out.println("The next value is stored in index:"+this.currentindex);
			}else{
				System.out.println("The index of an array is full.");
			}
		}else{
			System.out.println("The festival or festival array is null.");
		}
	}
}