class ClothRunner{
	public static void main(String[] ags){
		Cloth[] cloths = new Cloth[10];
		ClothStore clothstore = new ClothStore(cloths);
		
		Cloth cloth = new Cloth("Shirts",250,"red ","Good",10,false);
		clothstore.save(cloth);
		
		System.out.println("");
		
		Cloth cloth1 = new Cloth("t-shirts",280,"blue ","very good",12,true);
		clothstore.save(cloth1);
		
		System.out.println("");
		
		Cloth cloth2 = new Cloth("Hoodie",500,"black ","Exellent",6,true);
		clothstore.save(cloth2);
		
		System.out.println("");
		
		Cloth cloth3 = new Cloth("Blazer",1000,"black ","Exellent",2,true);
		clothstore.save(cloth3);
		
		System.out.println("");
		
		Cloth cloth4 = new Cloth("jeans",900,"green ","good",24,false);
		clothstore.save(cloth4);
		
		System.out.println("");
		
		Cloth cloth5 = new Cloth("Pants",700,"WHite","good",12,false);
		clothstore.save(cloth5);
		
		System.out.println("");
		
		Cloth cloth6 = new Cloth("Shorts",300,"lightCream","good",6,true);
		clothstore.save(cloth6);
		
		System.out.println("");
		
		Cloth cloth7 = new Cloth("Jacket",1100,"black","very good",12,true);
		clothstore.save(cloth7);
		
		System.out.println("");
		
		Cloth cloth8 = new Cloth("Leather Jacket",1900,"black","very Exellent",12,true);
		clothstore.save(cloth8);
		
		System.out.println("");
		
		Cloth cloth9 = new Cloth("Raincoat",1300,"black","very good",48,true);
		clothstore.save(cloth9);
	}
}