class StatueStore{
	Statue[] statue;
	int curentIndex = 0;
	
	StatueStore(Statue[] statue){
		this.statue = statue;
	}
	
	void save(Statue statue){
		System.out.println("The save is exicuting on class StatueStore.");
		
		if(statue != null && this.statue != null){
			int indexSize = this.statue.length -1;
			if(curentIndex <= indexSize){
				System.out.println("The next value is stored in index:"+this.curentIndex);
				this.statue[curentIndex] = statue;
				statue.printInfo();
				curentIndex++;
				System.out.println("The next value is stored in index:"+this.curentIndex);
			}else{
				System.out.println("the array is full.");
			}
		}else{
			System.out.println("The statue or statue array is null.");
			}
	}
}