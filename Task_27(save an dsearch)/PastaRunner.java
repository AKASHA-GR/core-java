class PastaRunner{
	public static void main(String[] args){
		String[] brand = new String[10];
		Pasta pasta = new Pasta(brand);
		pasta.save("Barilla");
		pasta.save("De Cecco");
		pasta.save("Rummo");
		pasta.save("Rustichella d'Abruzzo");
		pasta.save("Mancini");
		pasta.save("Benedetto Cavalieri");
		pasta.save("Garofalo");
		pasta.save("Monograno Felicetti");
		pasta.save("Martelli");
		pasta.save("Voiello");
		
		System.out.println("");
		
		boolean value = pasta.search("Mancini");
		System.out.println("The name in an array:"+value);
		
		
	}
}