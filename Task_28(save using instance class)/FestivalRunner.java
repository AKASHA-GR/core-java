class FestivalRunner{
	public static void main(String[]  args){
		
		Festival[] festivals = new Festival[10];
		
		FestivalStore festivalstore = new FestivalStore(festivals);

		Festival festival = new Festival("Ugadhi","Karnataka","03-19-2026","Hindu","India","Summer");
		festivalstore.save(festival);
		
		System.out.println("");
		
		Festival festival1 = new Festival("Dasara","Karnataka","08-19-2026","Hindu","India","autumn ");
		festivalstore.save(festival1);
		
		System.out.println("");
		
		Festival festival2 = new Festival("Deepavali","Karnataka","09-20-2026","Hindu","India","autumn");
		festivalstore.save(festival2);
		
		System.out.println("");
		
		Festival festival3 = new Festival("santranthi","Karnataka","01-14-2026","Hindu","India","winter");
		festivalstore.save(festival3);
		
		System.out.println("");
		
		Festival festival4 = new Festival("santranthi","Karnataka","01-14-2026","Hindu","India","winter");
		festivalstore.save(festival4);
		
		System.out.println("");
		
		Festival festival5 = new Festival("shivaratri","Karnataka","02-15-2026","Hindu","India","winter");
		festivalstore.save(festival5);
		
		System.out.println("");
		
		Festival festival6 = new Festival("Ganesh Chaturthi","Karnataka","01-14-2026","Hindu","India","monsoon");
		festivalstore.save(festival6);
		
		System.out.println("");
		
		Festival festival7 = new Festival("Ramadan","Karnataka","03-20-2026","Muslim","India","winter");
		festivalstore.save(festival7);
		
		System.out.println("");
		
		Festival festival8 = new Festival("Christmas","Karnataka","03-20-2026","Christian","India","winter");
		festivalstore.save(festival8);
		
		System.out.println("");
		
		Festival festival9 = new Festival("Holi","Karnataka","02-24-2026","Hindu","India","Spring");
		festivalstore.save(festival9);
		
		System.out.println("");
		
		
		//we get index of array is full...................................
		Festival festival10 = new Festival("Holi","Karnataka","02-24-2026","Hindu","India","Spring");
		festivalstore.save(festival10);
	}
}