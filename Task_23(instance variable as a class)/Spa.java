class Spa{
	String shopName;
	String customerName;
	String customerEmail;
	long contact;
	double price;
	Rating rating;
	SpaType spaType;
	SpaLocation spaLocation;
	ItemsCount itemsCount;
	ShopTime shopTime;
	
	Spa(String shopName,String customerName,String customerEmail,long contact,double price,Rating rating,SpaType spaType,SpaLocation spaLocation,ItemsCount itemsCount,ShopTime shopTime){
		this.shopName =shopName;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.contact = contact;
		this.price = price;
		this.rating = rating;
		this.spaType = spaType;
		this.spaLocation = spaLocation;
		this.itemsCount = itemsCount;
		this.shopTime = shopTime;
	}
	
	void getSpa(){
		System.out.println("The name of a shop:"+this.shopName);
		System.out.println("The customerName:" +this.customerName);
		System.out.println("The customerEmail:" +this.customerEmail);
		System.out.println("The customer contact:"+this.contact);
		System.out.println("The price:"+this.price);
		
		if(this.rating != null){
			rating.getRating();
		}else{
			System.out.println("The Rating is not there...");
		}
		
		if(this.spaType != null){
			spaType.getSpaType();
		} else{
			System.out.println("The spa type is not there...");
		}
		
		if(this.spaLocation != null){
			spaLocation.getSpaLocation();
		} else{
			System.out.println("The spa location is not there..");
		}
		
		if(this.itemsCount != null ){
			itemsCount.getItemsCount();
		} else{
			System.out.println("The ItemsCount is not there...");
		}
		
		if(this.shopTime != null){
			shopTime.getShopTime();
		} else{
			System.out.println("The shopTime is not there...");
		}
		
	} 
	
}