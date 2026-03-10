class ParliamentRunner{
	
	public static void main(String... args){
		
		Seats seats1 = new Seats(213,"Vidhan Sabha");
		Parliament parliament1 = new Parliament("BJP",seats1,Members.TEJASVISURYA);
		parliament1.printInfo();
		
		Seats seats2 = new Seats(75,"Vidhan Parishad");
		Parliament parliament2 = new Parliament("BJP",seats2,Members.JAGADISH_SHETTAR);
		parliament2.printInfo();
		
		Seats seats3 = new Seats(213,"Vidhan Sabha");
		Members members1 = Members.TEJASVISURYA;
		Parliament parliament3 = new Parliament("BJP",seats3,members1);
		parliament3.printInfo();
		
		Seats seats4 = new Seats(75,"Vidhan Parishad");
		Members members2 = Members.JAGADISH_SHETTAR;
		Parliament parliament4 = new Parliament("BJP",seats4,members2);
		parliament4.printInfo();
		System.out.println("");
		
	}
	
}