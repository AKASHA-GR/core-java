class TollgateStore{
	Tollgate[] tollgate;
	int curentIndex =0;
	
	TollgateStore(Tollgate[] tollgate){
		this.tollgate = tollgate;
	}
	
	void save(Tollgate tollgate){
		System.out.println("The tollgate is exicuting in class TollgateStore.");
		int indexSize = this.tollgate.length -1;
		
		if(tollgate != null && this.tollgate != null){
			if(curentIndex <= indexSize){
				System.out.println("The curent value is stored in index:"+this.curentIndex);
				this.tollgate[curentIndex] = tollgate;
				tollgate.printInfo();
				curentIndex++;
				System.out.println("The next value is stored in index:"+this.curentIndex);
			}else{
				System.out.println("The array is full.");
			}
		}else{
			System.out.println("The tollgate is null.");
		}
	}
}