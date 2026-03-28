class ProfileRunner{
	public static void main(String[] args){
		Profile[] profiles = new Profile[10];
		ProfileStore profilestore = new ProfileStore(profiles);
		
		Profile profile = new Profile("Akaza","07-07-2004","male",22,"BE",false);
		profilestore.save(profile);
		
		System.out.println("");
		
		Profile profile1 = new Profile("navin","04-26-2004","male",22,"bcom",true);
		profilestore.save(profile1);
		
		System.out.println("");
		
		Profile profile2 = new Profile("Surash","01-08-2005","male",23,"Mba",true);
		profilestore.save(profile2);
		
		System.out.println("");
		
		Profile profile3 = new Profile("manjulla","09-02-2005","female",23,"MBBS",false);
		profilestore.save(profile3);
		
		System.out.println("");
		
		Profile profile4 = new Profile("Darshan Nagari","09-30-2005","male",23,"MBBS",false);
		profilestore.save(profile4);
		
		System.out.println("");
		
		Profile profile5 = new Profile("vishnu","11-17-2004","male",22,"BE",false);
		profilestore.save(profile5);
		
		System.out.println("");
		
		Profile profile6 = new Profile("Abhi","06-06-2004","male",22,"Bca",true);
		profilestore.save(profile6);
		
		System.out.println("");
		
		Profile profile7 = new Profile("Amrutha","02-19-2008","female",18,"Bsc",false);
		profilestore.save(profile7);
		
		System.out.println("");
		
		Profile profile8 = new Profile("Soundarya","01-04-2005","female",22,"BE",true);
		profilestore.save(profile8);
		
		System.out.println("");
		
		Profile profile9 = new Profile("Shankar","07-13-2002","male",24,"Low",true);
		profilestore.save(profile9);
	}
}