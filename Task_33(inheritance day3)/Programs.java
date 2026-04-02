class Programs extends Stage{
	
	Programs(){
		super("Proscenium Stage",42000.0,85);
	}
	
	Programs(String type,double cost,int numberOflights){
		super(type,cost,numberOflights);
	}
	
	Programs(double cost){
		super("Thrust Stage",cost,90);
	}
}