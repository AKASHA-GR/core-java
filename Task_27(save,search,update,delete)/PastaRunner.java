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
		
		System.out.println("");
		
		boolean value1 = pasta.update(7,"Benedetto Cavalieri");
		System.out.println("The name in an array is updated:"+value1);
		
		
		System.out.println("");
		
		boolean value2 = pasta.update("Garofalo","hiiiiiiiiii");
		System.out.println("The name in an array is updated:"+value2);
		
		
		System.out.println("");
		
		boolean value3 = pasta.delete(2);
		System.out.println("The name in an array is deleted:"+value3);
		
		System.out.println("");
		
		boolean value4 = pasta.delete("Rustichella d'Abruzzo");
		System.out.println("The name in an array is deleted:"+value4);
		
	}
}