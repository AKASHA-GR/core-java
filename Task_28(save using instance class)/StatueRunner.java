class StatueRunner{
	public static void main(String[] args){
		Statue[] statues = new Statue[10];
		StatueStore statuestore = new StatueStore(statues);
		
		Statue statue = new Statue("Statue of Unity",182,597,"Gujarat",2018,"Iron");
		statuestore.save(statue);
		
		System.out.println("");
		
		Statue statue1 = new Statue("Statue of Belief",112,369,"Rajasthan",2022,"Iron");
		statuestore.save(statue1);
		
		System.out.println("");
		
		Statue statue2 = new Statue("Statue of Equlity",65,216,"Telangana",2022,"Iron");
		statuestore.save(statue2);
		
		System.out.println("");
		
		Statue statue3 = new Statue("Statue of Social Justice",62,206,"Anadra Pradesh",2024,"Iron");
		statuestore.save(statue3);
		
		System.out.println("");
		
		Statue statue4 = new Statue("Hanuman Statue",57,187,"Himachal Pradesh",2019,"Iron");
		statuestore.save(statue4);
		
		System.out.println("");
		
		Statue statue5 = new Statue("Hanuman Statue",52,171,"Andra Pradesh",2020,"Iron");
		statuestore.save(statue5);
		
		System.out.println("");
		
		Statue statue6 = new Statue("Statue of Sprituality",50,165,"uttar Pradesh",2025,"Iron");
		statuestore.save(statue6);
		
		System.out.println("");
		
		Statue statue7 = new Statue("Panchamukhi hanuman",49,161,"Karnataka",2022,"Iron");
		statuestore.save(statue7);
		
		System.out.println("");
		
		Statue statue8 = new Statue("Muthumalai statue",44,146,"Tamil Nadu",2022,"Iron");
		statuestore.save(statue8);
		
		System.out.println("");
		
		Statue statue9 = new Statue("Devi statue",43,141,"Uttar pradesh",2010,"Iron");
		statuestore.save(statue9);
		
	}
}