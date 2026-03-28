class Gender{
	String[] genders;
	int currentIndex = 0;
	
	Gender(String[] genders){
		this.genders = genders;
	}
	
	void store(String name){
		System.out.println("The store method is exicuting on class genders.");
		System.out.println("The name is stored:"+name);
		
		if(this.genders!= null && name!= null){
			System.out.println("The genders array is not null.");
			int currentSize=this.genders.length -1;
			
			if(currentIndex <= currentSize){
				System.out.println("The current value is stored in index:"+this.currentIndex);
				this.genders[currentIndex] = name;
				currentIndex++;
				System.out.println("The next value is stored in index:"+this.currentIndex);
				System.out.println("");
			}else{
				System.out.println("The array is full.");
			}
		}else{
			System.out.println("The genders array is not there.");
		}
	}
	
	
	void display(){
		System.out.println("Didplay all Genders.");
		
		if(this.genders != null){
			for(int i=0;i<= this.genders.length-1;i++){
				System.out.println("The index"+i+":"+genders[i]);
			}
		}else{
			System.out.println("The array is not there...");
		}
	}
	
	
	void sortAsc(){
		System.out.println("The Genders is stored in Acending order.");
		if(this.genders != null){
			for(int i=0;i<=this.genders.length-1;i++){
				for(int j=i+1;j<=this.genders.length-1;j++){
					if(this.genders[i]!= null && this.genders[j]!= null){
						if(this.genders[i].compareToIgnoreCase(this.genders[j])>0){
							String temp = this.genders[i];
							this.genders[i] = this.genders[j];
							this.genders[j] = temp;
						}
					}
				}
			}
			System.out.println("Sorting completed.");
		}else{
			System.out.println("The genders array is not there.");
		}
	}
	
	
	void sortDesc(){
		System.out.println("The Genders is stored in Desending order.");
		if(this.genders != null){
			for(int i=0;i<=this.genders.length-1;i++){
				for(int j=i+1;j<=this.genders.length-1;j++){
					if(this.genders[i]!= null && this.genders[j]!= null){
						if(this.genders[i].compareToIgnoreCase(this.genders[j])<0){
							String temp = this.genders[i];
							this.genders[i] = this.genders[j];
							this.genders[j] = temp;
						}
					}
				}
			}
			System.out.println("Sorting completed.");
		}else{
			System.out.println("The genders array is not there.");
		}
	}
	
}