class CapRunner{
	public static void main(String[] args){
		Cap[] caps = new Cap[10];
		CapStore capstore = new CapStore(caps);
		
		Cap cap = new Cap("Puma","PUMA","Red",300,"Cotton",false);
		capstore.save(cap);
		
		System.out.println("");
		
		Cap cap1 = new Cap("Nike","Swoosh","white",1000,"Synthatic",false);
		capstore.save(cap1);
		
		System.out.println("");
		
		Cap cap2 = new Cap("Adidas","Stripes","blue",700,"Cotton",true);
		capstore.save(cap2);
		
		System.out.println("");
		
		Cap cap3 = new Cap("Jockey","JOCKEY","green",900,"polyester",true);
		capstore.save(cap3);
		
		System.out.println("");
		
		Cap cap4 = new Cap("Decathlon","Solognac","black",400,"fabrics",true);
		capstore.save(cap4);
		
		System.out.println("");
		
		Cap cap5 = new Cap("Lowercase","LOWERCASE","black",500,"nylon",true);
		capstore.save(cap5);
		
		System.out.println("");
		
		Cap cap6 = new Cap("Lowercase","LOWERCASE","black",500,"nylon",true);
		capstore.save(cap6);
		
		System.out.println("");
		
		Cap cap7 = new Cap("Armour","A","black",1500,"polyester",true);
		capstore.save(cap7);
		
		System.out.println("");
		
		Cap cap8 = new Cap("North Face","Half Dome","yellow",1300,"polyester",true);
		capstore.save(cap8);
		
		System.out.println("");
		
		Cap cap9 = new Cap(" Columbia Sportswear","diamond","black",1800,"nylon",false);
		capstore.save(cap9);
	}
}