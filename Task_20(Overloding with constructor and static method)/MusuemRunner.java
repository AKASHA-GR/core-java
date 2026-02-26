class MusuemRunner{
	public static void main(String[] args){
		
		MusuemCreator.getMusuem();
		System.out.println("");
		
		MusuemCreator.getMusuem("National Musuem Delhi" ,50000);
		System.out.println("----------------------------------------");
		MusuemCreator.getMusuem("Indian Musuem Kolkata" ,30000);
		System.out.println("");
		
		MusuemCreator.getMusuem(40000);
	
	}
}