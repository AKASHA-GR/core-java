class ClothStore{
	Cloth[] cloth;
	int curentIndex;
	
	ClothStore(Cloth[] cloth){
		this.cloth = cloth;
	}
	
	void save(Cloth cloth){
		System.out.println("The save is exicuting  on class ClothStore.");
		
		if(cloth != null && this.cloth != null){
			int indexSize = this.cloth.length -1;
			System.out.println("The curent value is stored in index:"+indexSize);
			if(curentIndex <= indexSize){
				this.cloth[curentIndex] = cloth;
				cloth.printInfo();
				curentIndex++;
				System.out.println("The next value is stored in index:"+indexSize);
			}
		}
	}
}