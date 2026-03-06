class Lifespan{
	int maleLion;
	int femaleLion;
	
	
	Lifespan(int maleLion,int femaleLion){
		this.maleLion = maleLion;
		this.femaleLion = femaleLion;
	}
	
	void getLifespan(){
		System.out.println("The lifespan of male lion:"+this.maleLion);
		System.out.println("The lifespan of female lion:"+this.femaleLion);
	}
	
}