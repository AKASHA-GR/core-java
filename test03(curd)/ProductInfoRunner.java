class ProductInfoRunner{
	public static void main(String[] args){
		//store method
		Product[] product = new Product[10];
		ProductInfo productInfo1 = new ProductInfo(product);
		Product product1 = new Product(01,"milk","Nandini","01-04-2026","05-04-2026",Type.DARIY,24,300);
		productInfo1.store(product1);
		System.out.println("");
		
		Product product2 = new Product(02,"curd","Nandini","01-04-2026","10-04-2026",Type.DARIY,56,850);
		productInfo1.store(product2);
		System.out.println("");
		
		Product product3 = new Product(03,"Paneer","Nandini","01-04-2026","10-04-2026",Type.DARIY,50,80);
		productInfo1.store(product3);
		System.out.println("");
		
		Product product4 = new Product(04,"MasalaMajige","Nandini","01-04-2026","10-04-2026",Type.DARIY,10,120);
		productInfo1.store(product4);
		System.out.println("");
		
		Product product5 = new Product(05,"Butter","Nandini","01-04-2026","10-04-2026",Type.DARIY,350,250);
		productInfo1.store(product5);
		System.out.println("");
		
		
		
		
		//display all
		productInfo1.displayAll();
		System.out.println("");
		
		
		//getProductDetails
		productInfo1.getProductDetails(1);
		System.out.println("");
		
		//getProductPrice
		double ref1 = productInfo1.getProductPrice("curd");
		System.out.println("The price is:"+ref1);
		System.out.println();
		
		//getcompany
		String ref2 = productInfo1.getCompany("curd");
		System.out.println("The company name:"+ref2);
		System.out.println("");
		
		//get manufactureDate and expDate
		String ref3 = productInfo1.getmanufactureAndExpDate("curd");
		System.out.println("The manufactureDate and expDate:"+ref3);
		System.out.println("");
		
		//getproductName
		String ref4 = productInfo1.getProductName(Type.DARIY);
		System.out.println("The product name:"+ref4);
		System.out.println("");
		
		
		//getmanufactureDate
		String ref5 = productInfo1.getmanufactureDate("milk");
		System.out.println("The manufactureDate:"+ref5);
		System.out.println("");
		
		
		//getexpDate
		String ref6 = productInfo1.getExpDate("milk");
		System.out.println("The expairy date:"+ref6);
		System.out.println("");
		
		//update manufactureDate and expDate
		boolean ref7 =productInfo1.updateManufactureDateAndExpairy("Butter","02-03-2026","02-06-2026");
		System.out.println("The manufactureDate and expairy date is updated:"+ref7);
		System.out.println("");

		//update product price by product name
		boolean ref8 = productInfo1.updateProductPrice("Paneer",85);
		System.out.println("The product price is updated:"+ref8);
		
		//delete product by product name
		boolean ref9 = productInfo1.deleteProduct("MasalaMajige");
		System.out.println("The product is deleted:"+ref9);
	}
}

