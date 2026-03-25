class MapStore{
	
	Map[] map;
	int curentIndex = 0;
	
	MapStore(Map[] map){
		this.map = map;
	}
	
	void save(Map map){
		System.out.println("The save is exicutnig in class MapStore");
		
		if(map != null && this.map != null){
			System.out.println("The map or map array is not null.");
			
			int indexSize = this.map.length -1;
			System.out.println("The curent value is stored in index:"+curentIndex);
			if(curentIndex <= indexSize){
				this.map[curentIndex] = map;
				map.printInfo();
				curentIndex++;
				System.out.println("The next value is store in index:"+curentIndex);
			}else{
				System.out.println("The map array is full.");
			}
		}else{
			System.out.println("The map and map array is null.");
		}
		
	}

}