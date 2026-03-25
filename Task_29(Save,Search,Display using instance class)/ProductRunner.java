class ProductRunner{
	public static void main(String[] arge){
		Product[] products = new Product[100];
		ProductStore productstore = new ProductStore(products);
		
		Product product1 = new Product("Mysorsandle","Bengaluru","01-25-2026",Type.SOAP,38,"Akasha GR",WarrentYears.FOUR,false,1,"India");
		productstore.save(product1);
		System.out.println("");
		
		Product product2 = new Product("Medimix","Chennai","02-03-2026",Type.SOAP,42,"Nagaprajwal",WarrentYears.THREE,false,2,"India");
		productstore.save(product2);
		System.out.println("");
		
		Product product3 = new Product("Santoor","Tumkur","02-16-2026",Type.SOAP,39,"Rahul",WarrentYears.ONE,false,3,"India");
		productstore.save(product3);
		System.out.println("");
		
		Product product4 = new Product("Lifebuoy","Haridwar","03-03-2026",Type.SOAP,40,"shanker",WarrentYears.TWO,false,4,"India");
		productstore.save(product4);
		System.out.println("");
		
		Product product5 = new Product("Gram flour","Chitradurga","03-21-2026",Type.SOAP,35,"Ravi",WarrentYears.TWO,false,5,"India");
		productstore.save(product5);
		System.out.println("");
		
		Product product6 = new Product("Dove","Gujarat","12-21-2025",Type.SOAP,45,"Prabu",WarrentYears.ONE,false,6,"India");
		productstore.save(product6);
		System.out.println("");
		
		Product product7 = new Product("Dettol","Himachal Pradesh","11-06-2025",Type.SOAP,41,"Chandra",WarrentYears.SIX,false,7,"India");
		productstore.save(product7);
		System.out.println("");
		
		Product product8 = new Product("Lux","Texsos","01-30-2026",Type.SOAP,41,"Baratha",WarrentYears.FIVE,false,8,"America");
		productstore.save(product8);
		System.out.println("");
		
		Product product9 = new Product("Himalaya Neem","Bengaluru","03-06-2026",Type.SOAP,36,"Guru",WarrentYears.THREE,false,9,"India");
		productstore.save(product9);
		System.out.println("");
		
		Product product10 = new Product("Hamam","Mumbai","02-18-2026",Type.SOAP,42,"Dronna",WarrentYears.THREE,false,10,"India");
		productstore.save(product10);
		System.out.println("");
		
		Product product11 = new Product("clinic plus","Bengaluru","03-19-2026",Type.SHAMPU,1,"Guru raj",WarrentYears.ONE,false,11,"India");
		productstore.save(product11);
		System.out.println("");
		
		Product product12 = new Product("AllClear","Mangaluru","01-10-2026",Type.SHAMPU,2,"Kumar",WarrentYears.TWO,false,12,"India");
		productstore.save(product12);
		
		
		System.out.println("======================================================================================");
		System.out.println("");
		
		//store at time 10 array
		
		Product[] products1 = new Product[10];
		products1[0] = new Product("T-shirt","Mumbai","02-18-2026",Type.CLOTH,250,"Dronna Guru",WarrentYears.THREE,false,11,"India");
		products1[1] = new Product("Jaket","Bengaluru","03-06-2026",Type.CLOTH,1200,"Bhargava",WarrentYears.FOUR,false,12,"India");
		products1[2] = new Product("shirts","Tumkur","14-06-2025",Type.CLOTH,430,"Ramya",WarrentYears.SIX,false,13,"India");
		products1[3] = new Product("jeans","Mumbai","19-12-2025",Type.CLOTH,750,"Raghu",WarrentYears.TWO,false,14,"India");
		products1[4] = new Product("blazer","Bengaluru","24-02-2026",Type.CLOTH,1500,"Pavithra",WarrentYears.TWO,false,15,"India");
		products1[5] = new Product("Pants","Mysor","17-12-2025",Type.CLOTH,900,"Ganga",WarrentYears.THREE,false,16,"India");
		products1[6] = new Product("Sarees","Molkalmuru","25-03-2026",Type.CLOTH,10000,"Rajanna",WarrentYears.SIX,false,17,"India");
		products1[7] = new Product("formals","Bengaluru","02-03-2026",Type.CLOTH,1100,"Navin",WarrentYears.FOUR,false,18,"India");
		products1[8] = new Product("Kurtas","Dharvada","01-27-2026",Type.CLOTH,1800,"Govinda",WarrentYears.ONE,false,19,"India");
		products1[9] = new Product("shorts","Chitradurga","09-12-2025",Type.CLOTH,200,"Harish",WarrentYears.THREE,false,20,"India");
		ProductStore productstore1 = new ProductStore(products1);
		productstore1.save(products1[0]);
		productstore1.save(products1[1]);
		productstore1.save(products1[2]);
		productstore1.save(products1[3]);
		productstore1.save(products1[4]);
		productstore1.save(products1[5]);
		productstore1.save(products1[6]);
		productstore1.save(products1[7]);
		productstore1.save(products1[8]);
		productstore1.save(products1[9]);
//productstore1.save(products1[0],products1[1],products1[2],products1[3],products1[4],products1[5],products1[6],products1[7],products1[8],products1[9]);
		System.out.println("======================================================================================");
		System.out.println("");
		
		//search oparation using id
		
		boolean ref = productstore.search(8);
		System.out.println("The item is found:"+ref);
		System.out.println("");
		
		//search oparation is done using id and name
		
		boolean ref1 = productstore.search("Gram flour",5);
		System.out.println("The item is found:"+ref1);
		System.out.println("");
		
		//search oparation is done using id and name and originofCountry
		
		boolean ref2 = productstore.search("Lux",8,"America");
		System.out.println("The item is found:"+ref2);
		System.out.println("");
		System.out.println("======================================================================================");
		
		
		
		
		//display method using 
		
		productstore.display();
		System.out.println("======================================================================================");
		
		
		//get all info by country
		
		productstore.getAllOriginCountry("America");
		System.out.println("======================================================================================");
		
		
		//get all info by warrantyYears
		
		productstore.getAllByWarrantyYears(WarrentYears.TWO);
		System.out.println("======================================================================================");
		
		
		// get all info by type
		
		productstore.getAllByType(Type.SHAMPU);
		System.out.println("======================================================================================");
		
		
		// check WarrantyExpired By UniqueId
		
		boolean ref3 = productstore.checkWarrantyExpiredByUniqueId(9);
		System.out.println("The WarrantyExpired:"+ref3);
		
		
	}
}