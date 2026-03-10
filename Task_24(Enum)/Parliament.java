/*Declare below all the classes, then declare 3 variables, one should be primitive, one should be class and one should be enum Make sure each enum have 4 Constants , then declare a method to print info , dont forget null check. Create 4 instances of each classes and invoke printInfo method. 
Parliament,
Court,
DMart,
Fort,
Napkin,
Pumpkin,
Calendar ,
Horlicks,
Wallnut,
Cashew,
Paneer,
Mushroom,
Beer
*/

class Parliament{
	String party;
	Seats seats;
	Members members;
	
	
	Parliament(String party,Seats seats,Members members){
		this.party = party;
		this.seats = seats;
		this.members = members;
	}
	
	void printInfo(){
		System.out.println("The party name:"+this.party);
		
		if(this.seats != null){
			this.seats.getSeats();
		}else{
			System.out.println("The seats null.");
		}
		
		
		System.out.println("The parliament members:"+this.members);
	}
	 
}