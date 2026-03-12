class TowerRunner{
	public static void main(String[] args){
		
		String[] name = {"CNTC The Presidential Tower","Shapoorji Pallonji Parkwest Mahogany Tower","Shapoorji Pallonji Parkwest Maple Tower 4"};
		
		Location[] location = new Location[3];
		location[0] = new Location("Rajajinagar, Bengaluru",1.23);
		location[1] = new Location(" Binnypet, Bengaluru",1.25);
		location[2] = new Location("Jagajeevanram Nagar, Bengaluru",1.59);
		
		
		Tower tower = new Tower(name,location);
		tower.display();
		
	}
}