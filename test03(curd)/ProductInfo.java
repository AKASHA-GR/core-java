class ProductInfo{
	Product[] product;
	int currentIndex =0;
	
	ProductInfo(Product[] product){
		this.product = product;
	}
	
		void store(Product item){
			System.out.println("The store method is exicuting in class ProductInfo.");
			int indexSize = this.product.length -1;
			
			if(this.product != null && item!= null){
				if(currentIndex <= indexSize){
					System.out.println("The current value is store in index:"+this.currentIndex);
					this.product[currentIndex] = item;
					//item.display();
					currentIndex++;
					System.out.println("The next value is store in index:"+this.currentIndex);
				}else{
					System.out.println("The product array is full");
				}
			}else{
				System.out.println("The product array is null.");
			}
				
			
		}
	
		void displayAll(){
			System.out.println("Displaying all the products:");
			if(this.product!= null){
				for(int i=0;i<this.product.length;i++){
					if(this.product[i] != null){
						this.product[i].display();
					}
				}
			}else{
				System.out.println("The product array is null.");
			}
			
		}
	
		void getProductDetails(int id){
			System.out.println("The display product using productID.");
			if(this.product != null && id!= 0){
				for(int i=0;i<currentIndex;i++){
					if(product[i].productID == id ){
						this.product[i].display();
						//System.out.println(product[i].display());
					}
				}
			}else{
				System.out.println("The array or id is null.");
			}
		}
	
		double getProductPrice(String name){
			System.out.println("The display product name using productname.");
			if(this.product != null && name!= null){
				for(int i=0;i<currentIndex;i++){
					if(product[i].productName == name ){
						return product[i].price;
						//System.out.println(product[i].display());
					}
				}
			}else{
				System.out.println("The array or id is null.");
			}
			return 0;
		}
	
		String getCompany(String name){
			System.out.println("The display company name using productname.");
			if(this.product != null && name!= null){
				for(int i=0;i<currentIndex;i++){
					if(product[i].productName == name ){
						return product[i].company;
					}
				}
			}else{
				System.out.println("The array or id is null.");
			}
			return null;
		}
	
		String getmanufactureAndExpDate(String name){
		System.out.println("The display manufacturing Data and expDate using productname.");
		if(this.product != null && name!= null){
			for(int i=0;i<currentIndex;i++){
				if(product[i].productName == name ){
					String date1 = product[i].manufactureDate;
					String date2 =product[i].expDate;
					return date1+","+date2;
				}
			}
		}else{
			System.out.println("The array or id is null.");
		}
		return null;
	    }
		
		String getProductName(Type type){
		System.out.println("The display productname using type.");
		if(this.product != null && type!= null){
			for(int i=0;i<currentIndex;i++){
				if(product[i].type == type ){
					return product[i].productName;
				}
			}
		}else{
			System.out.println("The array or id is null.");
		}
		return null;
	    }
		
		
		String getmanufactureDate(String name){
		System.out.println("The display manufacturing Data using productname.");
		if(this.product != null && name!= null){
			for(int i=0;i<currentIndex;i++){
				if(product[i].productName == name ){
					return product[i].manufactureDate;
				}
			}
		}else{
			System.out.println("The array or id is null.");
		}
		return null;
	    }
		
		
		String getExpDate(String name){
		System.out.println("The display ExpDate using productname.");
		if(this.product != null && name!= null){
			for(int i=0;i<currentIndex;i++){
				if(product[i].productName == name ){
					return product[i].expDate;
				}
			}
		}else{
			System.out.println("The array or id is null.");
		}
		return null;
	    }
		
		boolean updateManufactureDateAndExpairy(String name,String mandate,String expdate){
			System.out.println("The update ManufactureDate using productName");
			
			if(this.product != null){
				for(int i=0;i<currentIndex;i++){
				if(product[i].productName == name ){
					 this.product[i].manufactureDate = mandate;
					 this.product[i].expDate = expdate;
					 System.out.println("The update manufactureDate:"+mandate);
					 System.out.println("The update expDate:"+expdate);
					 return true;
				}
			}
			}else{
			System.out.println("The array or id is null.");
		}
		return false;
		}
		
		
		boolean updateProductPrice(String name,double price){
			System.out.println("The update product price using productName");
			System.out.println("The name:"+name);
			
			if(this.product != null && name!= null){
				for(int i=0;i<currentIndex;i++){
				if(product[i].productName == name ){
					 this.product[i].price = price;
					 System.out.println("The update price:"+price);
					 return true;
				}
			}
			}else{
			System.out.println("The array or id is null.");
		}
		return false;
		}
		
		
		boolean deleteProduct(String name){
			System.out.println("The delete product using productName");
			System.out.println("The name:"+name);
			
			if(this.product != null && name!= null){
				for(int i=0;i<currentIndex;i++){
				if(product[i].productName == name ){
					 this.product[i] = null;
					 System.out.println("The delete name:"+name);
					 return true;
				}
			}
			}else{
			System.out.println("The array or id is null.");
		}
		return false;
		}
}