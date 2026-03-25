class TollgateRunner{
	public static void main(String[] args){
		Tollgate[] tollgetes = new Tollgate[10];
		TollgateStore tollgetestore = new TollgateStore(tollgetes);
		
		Tollgate tollgete = new Tollgate("Mysoru Expressway",250,8,2022,true,true);
		tollgetestore.save(tollgete);
		
		System.out.println("");
		
		Tollgate tollgete1 = new Tollgate("Chennai Expressway",150,10,2019,true,true);
		tollgetestore.save(tollgete1);
		
		System.out.println("");
		
		Tollgate tollgete2 = new Tollgate("Electronics City Flyover",85,6,2018,true,true);
		tollgetestore.save(tollgete2);
		
		System.out.println("");
		
		Tollgate tollgete3 = new Tollgate("Electronics City Flyover",85,6,2010,true,true);
		tollgetestore.save(tollgete3);
		
		System.out.println("");
		
		Tollgate tollgete4 = new Tollgate("Nelamangala",45,6,2004,true,true);
		tollgetestore.save(tollgete4);
		
		System.out.println("");
		
		Tollgate tollgete5 = new Tollgate("Belagavi",25,8,2007,true,true);
		tollgetestore.save(tollgete5);
		
		System.out.println("");
		
		Tollgate tollgete6 = new Tollgate("Hirehalli",75,10,2021,true,true);
		tollgetestore.save(tollgete6);
		
		System.out.println("");
		
		Tollgate tollgete7 = new Tollgate("Shanthigrama",50,7,2013,true,true);
		tollgetestore.save(tollgete7);
		
		System.out.println("");
		
		Tollgate tollgete8 = new Tollgate("Hoskote",25,9,2013,true,true);
		tollgetestore.save(tollgete8);
		
		System.out.println("");
		
		Tollgate tollgete9 = new Tollgate("Karjeevanhalli",85,9,2007,true,true);
		tollgetestore.save(tollgete9);
		
	}
}