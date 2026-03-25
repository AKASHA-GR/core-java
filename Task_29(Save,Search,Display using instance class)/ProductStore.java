class ProductStore{
	Product[] product;
	int curentIndex = 0;
	
	ProductStore(Product[] product){
		this.product = product;
	}
	
	void save(Product product){
		System.out.println("The save is exicuting in class ProductStore.");
		
		if(product!= null && this.product != null){
			System.out.println("The productname and array is not null.");
			
			int indexSize = this.product.length -1;
			if(curentIndex <= indexSize){
				System.out.println("The next value is store in index:"+this.curentIndex);
				this.product[curentIndex] = product;
				product.printInfo();
				this.curentIndex++;
				System.out.println("The next value is store in index:"+this.curentIndex);
			}else{
				System.out.println("The array is full.....");
			}
			
		}else{
			System.out.println("The productname and array is null.");
		}
	}
	
	
	void save(Product[] product){
		System.out.println("The save is exicuting in class ProductStore.");
		
		if(product!= null && this.product != null){
			System.out.println("The product and array is not null.");
			
			//if(this.product.length<10){
				for(Product pro:this.product){
				pro.printInfo();
				System.out.println("");
			}
			//}
			
			
		}else{
			System.out.println("The productname and array is null.");
		}
	}
	
	
	
	boolean search(int id){
		System.out.println("The search oparation is done using only uniqueId.");
		boolean found = false;
		
		if(this.product != null){
			System.out.println("The product array is not null.");
			if(id >0 && id<10){
				for(Product products:this.product){
					System.out.println("Compare with :"+products.uniqueId);
					if(products != null){
						if(products.uniqueId == id){
							found = true;
							break;
						}
					}
				}
			}else{
					System.out.println("The id is invalid.");
			}
			
		}else{
			System.out.println("The product array is null.");
		}
		return found;
	}
	
	
	
	
	boolean search(String searchByName,int id){
		System.out.println("The search oparation is done using Name and uniqueId.");
		boolean found = false;
		
		if(this.product != null && searchByName != null){
			System.out.println("The product name and array is not null.");
			if(id >0 && id<10){
				for(Product products:this.product){
					System.out.println("Compare with :"+products.name);
					System.out.println("Compare with :"+products.uniqueId);
					if(products != null){
						if(products.name == searchByName && products.uniqueId == id){
							found = true;
							break;
						}
					}
				}
			}else{
					System.out.println("The id is invalid.");
			}
			
		}else{
			System.out.println("The product name and array is null.");
		}
		return found;
	}
	
	
	
	boolean search(String searchByName,int id,String country){
		System.out.println("The search oparation is done using Name and uniqueId and also originCountry.");
		boolean found = false;
		
		if(this.product != null && searchByName != null && country != null){
			System.out.println("The product name,originCountry and array is not null.");
			if(id >0 && id<11){
				for(Product products:this.product){
					System.out.println("Compare with :"+products.name);
					System.out.println("Compare with :"+products.uniqueId);
					System.out.println("Compare with :"+products.originCountry);
					if(products != null){
						if(products.name == searchByName && products.uniqueId == id && products.originCountry == country){
							found = true;
							break;
						}
					}
				}
			}else{
					System.out.println("The id is invalid.");
			}
			
		}else{
			System.out.println("The product name and array is null.");
		}
		return found;
	}
	
	
	
	void display(){
		System.out.println("The display method is exicuting in class Product.");
		
		if(this.product != null){
			for(Product products:this.product){
				if(products != null){
					products.printInfo();
					System.out.println("");
				}
			}
		}else{
			System.out.println("The product array is null.");
		}
	}
	
	
	void getAllOriginCountry(String originCountry){
		System.out.println("The get all information by originCountry.");
		
		if(this.product != null && originCountry != null){
			System.out.println("The product array and originCountry is not null.");
			
			for(Product products:this.product){
				System.out.println("compare with:"+products.originCountry);
				if(products != null){
					if(products.originCountry == originCountry){
						products.printInfo();
						break;
					}
				}
			}
			
		}else{
			System.out.println("The array or originCountry is null.");
		}
	}
	
	
	
	void getAllByWarrantyYears(WarrentYears  year){
		System.out.println("The get info by warrent Years");
		System.out.println("The year is:"+year);
		
		if(this.product != null && year != null){
			System.out.println("The product array and warrent year is not null.");
			
			for(Product products:this.product){
				//System.out.println("Compare with :"+products.year);
				if(products != null){
						if(products.year == year){
						products.printInfo();
						System.out.println("");
						
					}
				}
			}
			
		}else{
			System.out.println("The product array and warrent year is null.");
		}
	}
	
	
	void getAllByType(Type type){
		System.out.println("The get info using type.");
		System.out.println("The type:"+type);
		
		if(this.product != null && type != null){
			System.out.println("The product array and type is not null.");
			
			for(Product products:this.product){
				//System.out.println("Compare with:"+products.type);
				if(products != null){
					if(products.type == type){
						products.printInfo();
						System.out.println("");
						
					}
				}
			}
			
		}else{
			System.out.println("The product array or type is null.");
		}
	}
	
	
	boolean checkWarrantyExpiredByUniqueId(int uniqueId){
		System.out.println("The check Warranty Expired By UniqueId.");
		System.out.println("The uniqueId:"+uniqueId);
		
		boolean found = false;
		
		if(this.product != null){
			System.out.println("The product array and uniqueId is not null.");
			if(uniqueId>0 && uniqueId<12){
				for(Product products:this.product){
					//System.out.println("compare with:"+products.uniqueId);
					if(products != null){
						if(products.uniqueId == uniqueId){
							if(products.warrentyExpired == true){
								found = true;
								break;
							}
						}
					}
				}
			}
			
		}else{
			System.out.println("The product array or uniqueId is null.");
		}
		return false;
	}


}