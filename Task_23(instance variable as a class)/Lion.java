class Lion{
	String family;
	int lionRoarUptoKM;
	int population;
	double weight;
	double height;
	Lifespan lifespan;
	Reast reast;
	Run run;
	LionColor lioncolor;
	Nails nails;
	
	
	Lion(String family,int lionRoarUptoKM,int population,double weight,double height,Lifespan lifespan,Reast reast,Run run,LionColor lioncolor,Nails nails){
		this.family = family;
		this.lionRoarUptoKM = lionRoarUptoKM;
		this.population = population;
		this.weight = weight;
		this.height = height;
		this.lifespan = lifespan;
		this.reast = reast;
		this.run = run;
		this.lioncolor = lioncolor;
		this.nails = nails;
	}
	
	
	void getLion(){
		System.out.println("The lion belong to:" +this.family);
		System.out.println("The lionRoarUptoKM:" +this.lionRoarUptoKM);
		System.out.println("The lion population:" +this.population);
		System.out.println("The lion weight:" +this.weight);
		System.out.println("The lion height:" +this.height);
		
		
		
		
		if(lifespan != null){
			this.lifespan.getLifespan();			
		}else{
			System.out.println("there is is not defined...");
		}
		
		if(reast != null){
			this.reast.getReast();
		}else{
			System.out.println("there is is not defined...");
		}
		
		if(run != null){
			this.run.getRun();
		}else{
			System.out.println("there is is not defined...");
		}
		
		if(lioncolor != null){
			this.lioncolor.getLionColor();
		}else{
			System.out.println("there is is not defined...");
		}
		
		if(nails != null){
			this.nails.getNails();
		}else{
			System.out.println("there is is not defined...");
		}
	}
	
	
}