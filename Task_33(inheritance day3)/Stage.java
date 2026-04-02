class Stage{
	String type;
	double cost;
	int numberOflights;
	
	
	Stage(String type,double cost,int numberOflights){
		this.type = type;
		this.cost = cost;
		this.numberOflights = numberOflights;
		System.out.println("The decorate method is exicuting in class Stage.");
	}
}